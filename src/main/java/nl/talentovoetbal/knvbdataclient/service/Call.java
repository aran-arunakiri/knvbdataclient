package nl.talentovoetbal.knvbdataclient.service;

import nl.talentovoetbal.knvbdataclient.model.GenericResponse;

import java.io.IOException;

public interface Call<T extends GenericResponse<?>> {
    T execute()throws IOException;
}
