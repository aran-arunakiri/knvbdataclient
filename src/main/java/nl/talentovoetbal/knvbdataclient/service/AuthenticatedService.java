package nl.talentovoetbal.knvbdataclient.service;

import nl.talentovoetbal.knvbdataclient.Main;
import nl.talentovoetbal.knvbdataclient.model.Error;
import nl.talentovoetbal.knvbdataclient.model.GenericResponse;
import nl.talentovoetbal.knvbdataclient.model.Session;
import retrofit.RetrofitError;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AuthenticatedService implements InvocationHandler {
    private static KNVBDataService service;
    private KNVBDataService proxy;
    private static String apiKey;
    private static String pathName;
    protected static String sessionId = null;
    protected static int errorCount = 0;

    public AuthenticatedService(KNVBDataService service, String apiKey, String pathName) {
        this.service = service;
        this.apiKey = apiKey;
        this.pathName = pathName;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Main.logger.info("########### invoke ###########");
        this.proxy = (KNVBDataService) proxy;
        GenericResponse response = null;
        try {
            Main.logger.info("method name = " + method.getName());
            Main.logger.info("method args = " + args);
            response = (GenericResponse) method.invoke(service, args);

            Main.logger.info("base response message = " + response.message);
            Main.logger.info("base response code = " + response.errorCode);

            if (!method.getName().equals("initialize") && errorCount < 3 && (Error.ERROR_CODE_SESSION_EXPIRED == response.errorCode || Error.ERROR_CODE_NO_SESSION_OR_HASH == response.errorCode)) {
                errorCount++;
                Main.logger.error("ERROR mesage = " + response.message);
                Main.logger.error("ERROR refreshing sessionId, errorcount = " + errorCount);
                refreshSessionId();
                return method.invoke(proxy, args);
            } else {
                Main.logger.info("ERROR count = " + errorCount);
                errorCount = 0;
                return response;
            }

        } catch (RetrofitError error) {
            throw error;
        } catch (InvocationTargetException e) {
            Main.logger.info("InvocationTargetException");
            e.printStackTrace();
            return response;
        } catch (IllegalAccessException e) {
            Main.logger.info("IllegalAccessException");
            e.printStackTrace();
            return response;
        }
    }

    private void refreshSessionId() {
        // Main.logger.info("refreshSessionId() current id = " + AuthenticatedService.sessionId);
        GenericResponse<Session> initCall = proxy.initialize(AuthenticatedService.pathName, AuthenticatedService.apiKey);
        Session session = initCall.data.get(0);
        AuthenticatedService.sessionId = session.PHPSESSID;
        Main.logger.info("new sessionId = " + AuthenticatedService.sessionId);
    }

    public static KNVBDataService wrap(KNVBDataService service, String apiKey, String pathName) {
        AuthenticatedService handler = new AuthenticatedService(service, apiKey, pathName);
        return (KNVBDataService) Proxy.newProxyInstance(service.getClass().getClassLoader(), new Class[]{KNVBDataService.class}, handler);
    }

}
