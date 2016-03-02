package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("teamid")
    @Expose
    public String teamId;
    @SerializedName("teamname")
    @Expose
    public String teamName;
    @SerializedName("speeldag")
    @Expose
    public String speelDag;
    @SerializedName("categorie")
    @Expose
    public String categorie;
    @SerializedName("regulierecompetitie")
    @Expose
    public String reguliereCompetitie;
    @SerializedName("bekercompetitie")
    @Expose
    public String bekerCompetitie;
    @SerializedName("nacompetitie")
    @Expose
    public String naCompetitie;

    public Team(){

    }

}