package nl.talentovoetbal.knvbdataclient.service;


import retrofit.appengine.UrlFetchClient;
import retrofit.client.Request;
import retrofit.client.Response;

import java.io.IOException;

public class InterceptingUrlFetchClient extends UrlFetchClient {
    public interface Interceptor {
        void beforeExecute(Request request);
    }

    private Interceptor interceptor;

    @Override
    public Response execute(Request request) throws IOException {
        if (interceptor != null) {
            interceptor.beforeExecute(request);
        }
        return super.execute(request);
    }

    public void setInterceptor(Interceptor interceptor) {
        this.interceptor = interceptor;
    }
}
