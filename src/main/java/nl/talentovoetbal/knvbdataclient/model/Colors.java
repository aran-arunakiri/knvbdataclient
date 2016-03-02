package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Colors {

    @SerializedName("foreground")
    @Expose
    public String foreground;
    @SerializedName("background1")
    @Expose
    public String background1;
    @SerializedName("background2")
    @Expose
    public String background2;
    @SerializedName("verloop")
    @Expose
    public String verloop;

}