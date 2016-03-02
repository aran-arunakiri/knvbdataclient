package nl.talentovoetbal.knvbdataclient;

import com.jakewharton.retrofit.Ok3Client;
import nl.talentovoetbal.knvbdataclient.model.GenericResponse;
import nl.talentovoetbal.knvbdataclient.model.Team;
import nl.talentovoetbal.knvbdataclient.service.KNVBDataService;
import nl.talentovoetbal.knvbdataclient.service.KNVBDataServiceFactory;
import okhttp3.OkHttpClient;

public class MainTest {
    public static final String API_KEY = "PlNHZdEj6p3kBb3";
    public static final String PATH_NAME = "voorwaartst";

    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Ok3Client ok3Client = new Ok3Client(okHttpClient);
        KNVBDataService service = KNVBDataServiceFactory.get(PATH_NAME, API_KEY, ok3Client);
        GenericResponse<Team> teamResponseCall = service.getTeams();
        Main.logger.info("teamsize = " + teamResponseCall.data.size());

        for (Team team : teamResponseCall.data) {
            System.out.println(team.teamName);
            System.out.println("gameResults = " + service.getGameResults(team.teamId, 40, "R").data.size());
        }
    }
}
