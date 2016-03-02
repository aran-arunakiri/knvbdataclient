package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerData {

    @SerializedName("token")
    @Expose
    public String token;
    @SerializedName("clubid")
    @Expose
    public String clubId;

}