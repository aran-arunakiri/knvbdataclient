package nl.talentovoetbal.knvbdataclient.service;

import nl.talentovoetbal.knvbdataclient.model.*;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface KNVBDataService {

    @GET("/initialisatie/{" + KNVBDataServiceFactory.PARAM_PATH_NAME + "}")
    GenericResponse<Session> initialize(@Path(KNVBDataServiceFactory.PARAM_PATH_NAME) String pathName, @Query(KNVBDataServiceFactory.PARAM_API_KEY) String apiKey);

    @GET("/teams")
    GenericResponse<Team> getTeams();

    @GET("/teams/{teamId}/results")
    GenericResponse<MatchResult> getGameResults(@Path("teamId") String teamId, @Query("weeknummer") int weekNumber, @Query("comptype") String CompetitionType);

    @GET("/teams/{teamId}/schedule")
    GenericResponse<ProgramMatch> getProgram(@Path("teamId") String teamId, @Query("weeknummer") int weekNumber, @Query("comptype") String CompetitionType);

    @GET("/teams/{teamId}/ranking")
    GenericResponse<RankingTeam> getRanking(@Path("teamId") String teamId, @Query("pouleid") int pouleId, @Query("comptype") String CompetitionType, @Query("periode") String period);

    @GET("/wedstrijd/{wedstrijdid}")
    GenericResponse<MatchDetails> getMatchDetails(@Path("wedstrijdid") String matchId);

    @GET("/wedstrijden")
    GenericResponse<MatchDetails> getClubMatchListing(String matchId, @Query("weeknummer") Integer weekNumber, @Query("order") String order, @Query("comptype") String CompetitionType, @Query("zaalveld") String zaalVeld);

    @GET("/competities")
    GenericResponse<MatchDetails> getCompetitionListing();

    @GET("/competities/{TeamId}/{District}/{CompId}/{ClassId}/{PouleId}")
    GenericResponse<MatchResult> getCompetitionResults(@Path("TeamId") String teamId, @Path("District") String district, @Path("CompId") String competitionId, @Path("ClassId") String classId, @Path("PouleId") String pouleId, @Query("weeknummer") Integer weekNumber);

    @GET("/competities/{TeamId}/{District}/{CompId}/{ClassId}/{PouleId}/schedule")
    GenericResponse<ProgramMatch> getCompetitionProgram(@Path("TeamId") String teamId, @Path("District") String district, @Path("CompId") String competitionId, @Path("ClassId") String classId, @Path("PouleId") String pouleId, @Query("weeknummer") Integer weekNumber);

    @GET("/competities/{TeamId}/{District}/{CompId}/{ClassId}/{PouleId}/ranking")
    GenericResponse<RankingTeam> getCompetitionRanking(@Path("TeamId") String teamId, @Path("District") String district, @Path("CompId") String competitionId, @Path("ClassId") String classId, @Path("PouleId") String pouleId, @Query("periode") String period);

    @GET("/banners")
    GenericResponse<BannerData> getBannerData();
}
