package nl.talentovoetbal.knvbdataclient.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MatchDetails {

    @SerializedName("Datum")
    @Expose
    public String datum;
    @SerializedName("Tijd")
    @Expose
    public String tijd;
    @SerializedName("Verzameltijd")
    @Expose
    public String verzameltijd;
    @SerializedName("LogoThuis")
    @Expose
    public String logoThuis;
    @SerializedName("ThuisClub")
    @Expose
    public String thuisClub;
    @SerializedName("ThuisClubNummer")
    @Expose
    public String thuisClubNummer;
    @SerializedName("ThuisTeamId")
    @Expose
    public String thuisTeamId;
    @SerializedName("LogoUit")
    @Expose
    public String logoUit;
    @SerializedName("UitClub")
    @Expose
    public String uitClub;
    @SerializedName("UitClubNummer")
    @Expose
    public String uitClubNummer;
    @SerializedName("UitTeamId")
    @Expose
    public String uitTeamId;
    @SerializedName("Scheidsrechter")
    @Expose
    public String scheidsrechter;
    @SerializedName("Facility_Id")
    @Expose
    public String facilityId;
    @SerializedName("Facility_naam")
    @Expose
    public String facilityNaam;
    @SerializedName("Facility_Stad")
    @Expose
    public String facilityStad;
    @SerializedName("Facility_Postcode")
    @Expose
    public String facilityPostcode;
    @SerializedName("Facility_Adres")
    @Expose
    public String facilityAdres;
    @SerializedName("Aantal_Fotos")
    @Expose
    public String aantalFotos;
    @SerializedName("Aantal_Videos")
    @Expose
    public String aantalVideos;
    @SerializedName("Aantal_Verslagen")
    @Expose
    public String aantalVerslagen;
    @SerializedName("Aantal_Reacties")
    @Expose
    public String aantalReacties;
    @SerializedName("PuntenTeam1")
    @Expose
    public String PuntenTeam1;
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
    @SerializedName("MatchID")
    @Expose
    public String matchID;
    @SerializedName("WedstrijdNummer")
    @Expose
    public String wedstrijdNummer;
    @SerializedName("Longitude")
    @Expose
    public String longitude;
    @SerializedName("Latitude")
    @Expose
    public String latitude;
    @SerializedName("Bijzonderh")
    @Expose
    public String bijzonderh;
    @SerializedName("VeldKNVB")
    @Expose
    public String veldKNVB;
    @SerializedName("VeldClub")
    @Expose
    public String veldClub;
    @SerializedName("Kleedkamer_thuis")
    @Expose
    public String kleedkamerThuis;
    @SerializedName("Kleedkamer_uit")
    @Expose
    public String kleedkamerUit;
    @SerializedName("Kleedkamer_official")
    @Expose
    public String kleedkamerOfficial;
}