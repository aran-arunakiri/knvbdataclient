package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankingTeam {

    @SerializedName("naam")
    @Expose
    public String naam;
    @SerializedName("TeamID")
    @Expose
    public String teamID;
    @SerializedName("logo")
    @Expose
    public String logo;
    @SerializedName("Positie")
    @Expose
    public String positie;
    @SerializedName("Gespeeld")
    @Expose
    public String gespeeld;
    @SerializedName("Gewonnen")
    @Expose
    public String gewonnen;
    @SerializedName("Gelijk")
    @Expose
    public String gelijk;
    @SerializedName("Verloren")
    @Expose
    public String verloren;
    @SerializedName("Punten")
    @Expose
    public String punten;
    @SerializedName("DoelpuntenVoor")
    @Expose
    public String doelpuntenVoor;
    @SerializedName("DoelpuntenTegen")
    @Expose
    public String doelpuntenTegen;
    @SerializedName("PuntenMindering")
    @Expose
    public String puntenMindering;
    @SerializedName("CompType")
    @Expose
    public String compType;
    @SerializedName("CompNummer")
    @Expose
    public String compNummer;
    @SerializedName("WedstrijdDag")
    @Expose
    public String wedstrijdDag;
    @SerializedName("Periode")
    @Expose
    public String periode;

}