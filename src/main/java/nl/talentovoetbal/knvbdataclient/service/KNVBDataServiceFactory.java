package nl.talentovoetbal.knvbdataclient.service;


import com.jakewharton.retrofit.Ok3Client;
import com.sun.javafx.fxml.builder.URLBuilder;
import io.mikael.urlbuilder.UrlBuilder;
import nl.talentovoetbal.knvbdataclient.Main;
import okhttp3.*;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.codec.digest.DigestUtils;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.appengine.UrlFetchClient;
import retrofit.client.*;

import javax.print.URIException;
import java.io.IOException;
import java.util.Map;

public class KNVBDataServiceFactory {
    public static final String BASE_URL = "http://api.knvbdataservice.nl/api";
    public static final String PARAM_API_KEY = "api_key";
    public static final String PARAM_PATH_NAME = "path_name";
    private static KNVBDataService service;

    public static KNVBDataService get(final String pathName, final String apiKey) {
        if (service == null) {
            InterceptingUrlFetchClient client = new InterceptingUrlFetchClient();
            client.setInterceptor(new InterceptingUrlFetchClient.Interceptor() {
                @Override
                public void beforeExecute(retrofit.client.Request request) {
                    String path = request.getUrl().toString();
                    int pathEndIndex = path.lastIndexOf("?");
                    if (pathEndIndex == -1) {
                        pathEndIndex = path.length();
                    }
                    path = path.substring(BASE_URL.length(), pathEndIndex);

                    if (!path.startsWith("/initialisatie")) {
                        String sessionId = AuthenticatedService.sessionId;
                        String newUrl = UrlBuilder.fromString(request.getUrl())
                                .addParameter("hash", generateMD5Hash(apiKey, path, sessionId))
                                .addParameter("PHPSESSID", AuthenticatedService.sessionId).toString();

                        request = new retrofit.client.Request(request.getMethod(), newUrl, request.getHeaders(), request.getBody());
                        Main.logger.info("final url = " + request.getUrl().toString());
                    }
                }
            });
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(BASE_URL)
                    .setClient(client)
                    .build();
            service = AuthenticatedService.wrap(restAdapter.create(KNVBDataService.class), apiKey, pathName);

        }
        return service;
    }

    private static String generateMD5Hash(String apiKey, String path, String sessionId) {
        StringBuilder sb = new StringBuilder();
        sb.append(apiKey);
        sb.append("#");
        sb.append(path);
        sb.append("#");
        sb.append(sessionId);
        Main.logger.info("MD5 :" + sb.toString());
        Main.logger.info("MD5 HASH :" + DigestUtils.md5Hex(sb.toString()));
        return DigestUtils.md5Hex(sb.toString());
    }


}
