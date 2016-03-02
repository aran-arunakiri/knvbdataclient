package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rs {

    @SerializedName("bron")
    @Expose
    public String bron;
    @SerializedName("rssdefault")
    @Expose
    public Integer rssDefault;
    @SerializedName("prof_rss")
    @Expose
    public Integer profRss;

}