package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Error {
    public static final int ERROR_CODE_SESSION_EXPIRED = 9992;
    public static final int ERROR_CODE_NO_SESSION_OR_HASH = 9998;

    @SerializedName("errorCode")
    @Expose
    public String errorcode;
    @SerializedName("message")
    @Expose
    public String message;

}