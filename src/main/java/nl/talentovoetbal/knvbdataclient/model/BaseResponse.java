package nl.talentovoetbal.knvbdataclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse {
    @SerializedName("errorcode")
    @Expose
    public int errorCode;
    @SerializedName("message")
    @Expose
    public String message;

    public BaseResponse(){

    }
}
