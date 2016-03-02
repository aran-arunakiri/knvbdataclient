package nl.talentovoetbal.knvbdataclient.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MatchResult {

    @SerializedName("MatchID")
    @Expose
    public String matchID;
    @SerializedName("WedstrijdNummer")
    @Expose
    public String wedstrijdNummer;
    @SerializedName("Datum")
    @Expose
    public String datum;
    @SerializedName("Tijd")
    @Expose
    public String tijd;
    @SerializedName("ThuisClub")
    @Expose
    public String thuisClub;
    @SerializedName("ThuisLogo")
    @Expose
    public String thuisLogo;
    @SerializedName("ThuisTeamID")
    @Expose
    public String thuisTeamID;
    @SerializedName("UitClub")
    @Expose
    public String uitClub;
    @SerializedName("UitLogo")
    @Expose
    public String uitLogo;
    @SerializedName("UitTeamID")
    @Expose
    public String uitTeamID;
    @SerializedName("PuntenTeam1")
    @Expose
    public String puntenTeam1;
    @SerializedName("PuntenTeam2")
    @Expose
    public String puntenTeam2;
    @SerializedName("PuntenTeam1Verl")
    @Expose
    public String puntenTeam1Verl;
    @SerializedName("PuntenTeam2Verl")
    @Expose
    public String puntenTeam2Verl;
    @SerializedName("PuntenTeam1Strafsch")
    @Expose
    public String puntenTeam1Strafsch;
    @SerializedName("PuntenTeam2Strafsch")
    @Expose
    public String puntenTeam2Strafsch;
    @SerializedName("Bijzonderheden")
    @Expose
    public String bijzonderheden;
    @SerializedName("Scheidsrechter")
    @Expose
    public String scheidsrechter;
    @SerializedName("CompType")
    @Expose
    public String compType;
    @SerializedName("CompNummer")
    @Expose
    public String compNummer;
    @SerializedName("WedstrijdDag")
    @Expose
    public String wedstrijdDag;
}