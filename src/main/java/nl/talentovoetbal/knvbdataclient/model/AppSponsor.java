package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AppSponsor {

    @SerializedName("naam")
    @Expose
    public String naam;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("banner")
    @Expose
    public String banner;

}