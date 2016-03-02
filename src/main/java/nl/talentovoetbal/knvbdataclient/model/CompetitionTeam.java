package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompetitionTeam {

    @SerializedName("CompName")
    @Expose
    public String compName;
    @SerializedName("ClassName")
    @Expose
    public String className;
    @SerializedName("PouleName")
    @Expose
    public String pouleName;
    @SerializedName("District")
    @Expose
    public String district;
    @SerializedName("CompId")
    @Expose
    public String compId;
    @SerializedName("ClassId")
    @Expose
    public String classId;
    @SerializedName("PouleId")
    @Expose
    public String pouleId;
    @SerializedName("CompType")
    @Expose
    public String compType;
    @SerializedName("TeamId")
    @Expose
    public String teamId;
    @SerializedName("TeamAanduiding")
    @Expose
    public String teamAanduiding;
    @SerializedName("TeamReportNaam")
    @Expose
    public String teamReportNaam;
    @SerializedName("metStand")
    @Expose
    public String metStand;
    @SerializedName("Perioden")
    @Expose
    public String perioden;

}
