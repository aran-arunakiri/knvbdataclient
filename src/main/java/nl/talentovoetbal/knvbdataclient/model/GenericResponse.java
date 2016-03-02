package nl.talentovoetbal.knvbdataclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GenericResponse<T> extends BaseResponse {
    @SerializedName("List")
    @Expose
    public List<T> data = new ArrayList<T>();

    public GenericResponse(){

    }

}
