package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProgramMatch {

    @SerializedName("MatchID")
    @Expose
    public String MatchID;
    @SerializedName("WedstrijdNummer")
    @Expose
    public String WedstrijdNummer;
    @SerializedName("Datum")
    @Expose
    public String Datum;
    @SerializedName("Tijd")
    @Expose
    public String Tijd;
    @SerializedName("Verzameltijd")
    @Expose
    public String Verzameltijd;
    @SerializedName("ThuisClub")
    @Expose
    public String ThuisClub;
    @SerializedName("ThuisLogo")
    @Expose
    public String ThuisLogo;
    @SerializedName("ThuisTeamID")
    @Expose
    public String ThuisTeamID;
    @SerializedName("UitClub")
    @Expose
    public String UitClub;
    @SerializedName("UitLogo")
    @Expose
    public String UitLogo;
    @SerializedName("UitTeamID")
    @Expose
    public String UitTeamID;
    @SerializedName("Bijzonderheden")
    @Expose
    public String Bijzonderheden;
    @SerializedName("Scheidsrechter")
    @Expose
    public String Scheidsrechter;
    @SerializedName("CompNummer")
    @Expose
    public String CompNummer;
    @SerializedName("CompType")
    @Expose
    public String CompType;
    @SerializedName("WedstrijdDag")
    @Expose
    public String WedstrijdDag;
    @SerializedName("VeldKNVB")
    @Expose
    public String VeldKNVB;
    @SerializedName("VeldClub")
    @Expose
    public String VeldClub;
    @SerializedName("Kleedkamer_thuis")
    @Expose
    public String KleedkamerThuis;
    @SerializedName("Kleedkamer_uit")
    @Expose
    public String KleedkamerUit;
    @SerializedName("Kleedkamer_official")
    @Expose
    public String KleedkamerOfficial;

}