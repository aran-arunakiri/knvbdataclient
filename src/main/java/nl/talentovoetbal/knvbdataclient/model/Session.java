package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Session {

    @SerializedName("PHPSESSID")
    @Expose
    public String PHPSESSID;
    @SerializedName("clubnaam")
    @Expose
    public String clubNaam;
    @SerializedName("apiversion")
    @Expose
    public String apiVersion;
    @SerializedName("changed")
    @Expose
    public String changed;
    @SerializedName("changelog")
    @Expose
    public String changelog;
    @SerializedName("logo")
    @Expose
    public String logo;
    @SerializedName("kleuren")
    @Expose
    public Colors kleuren;
    @SerializedName("rss")
    @Expose
    public java.util.List<Rs> rss = new ArrayList<Rs>();
    @SerializedName("twitter")
    @Expose
    public java.util.List<Twitter> twitter = new ArrayList<Twitter>();
    @SerializedName("twittertags")
    @Expose
    public java.util.List<String> twitterTags = new ArrayList<String>();
    @SerializedName("appsponsors")
    @Expose
    public java.util.List<AppSponsor> appSponsors = new ArrayList<AppSponsor>();

}