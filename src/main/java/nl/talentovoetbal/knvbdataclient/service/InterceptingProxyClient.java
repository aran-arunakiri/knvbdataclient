package nl.talentovoetbal.knvbdataclient.service;

import retrofit.appengine.UrlFetchClient;
import retrofit.client.Client;
import retrofit.client.Request;
import retrofit.client.Response;

import java.io.IOException;

public class InterceptingProxyClient implements retrofit.client.Client {

    public interface Interceptor {
        void beforeExecute(Request request);
    }

    private Interceptor interceptor;
    private Client realClient;

    @Override
    public Response execute(Request request) throws IOException {
        if (interceptor != null) {
            interceptor.beforeExecute(request);
        }
        return realClient.execute(request);
    }

    public void setRealClient(Client realClient) {
        this.realClient = realClient;
    }

    public void setInterceptor(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

}
