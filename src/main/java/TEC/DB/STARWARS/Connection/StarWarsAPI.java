package TEC.DB.STARWARS.Connection;

import TEC.DB.STARWARS.Provider.BaseStarWars;
import TEC.DB.STARWARS.StarWarsObj.StarWarsReport;
import retrofit2.Call;
import java.util.Map;


public class StarWarsAPI extends BaseStarWars<StarWarsReport> {

    private IStarWarsResource starWarsResource;
    

    public StarWarsAPI(IStarWarsResource starWarsResource) {
        this.starWarsResource = starWarsResource;
    }


    @Override
    public StarWarsReport byPeople(String peopleID) {
        try {
            var options = this.queryStringOptions(peopleID);
            Call<StarWarsReport> starWarsReportCall = this.starWarsResource.get(options);
            StarWarsReport starWarsReport = starWarsReportCall.execute().body();
            return this.fromProviderReport(starWarsReport);
        } catch (Exception e) {
            throw new RuntimeException("Error calling the remote StarWars provider", e);
        }
    }

    @Override
    public StarWarsReport byPlanet(String planetID) {
        try {
            var options = this.queryStringOptions(planetID);
            Call<StarWarsReport> starWarsReportCall = this.starWarsResource.get(options);
            StarWarsReport starWarsReport = starWarsReportCall.execute().body();
            return this.fromProviderReport(starWarsReport);
        } catch (Exception e) {
            throw new RuntimeException("Error calling the remote StarWars provider", e);
        }
    }


    private Map<String, String> queryStringOptions(String _id) {
        return Map.of();
    }
}
