package TEC.DB.STARWARS.Connection;

import TEC.DB.STARWARS.Provider.BaseStarWarsProvider;
import TEC.DB.STARWARS.StarWarsObj.*;


public class StarWarsAPI extends BaseStarWarsProvider {

    private IStarWarsResource starWarsResource;
    

    public StarWarsAPI(IStarWarsResource starWarsResource) {
        this.starWarsResource = starWarsResource;
    }


    @Override
    public People byPeople(String peopleID) {
        try {
            retrofit2.Call<People> peopleCall = this.starWarsResource.getPeople(peopleID);
            People peopleReport = peopleCall.execute().body();
            return peopleReport;
        } catch (Exception e) {
            throw new RuntimeException("Error calling the remote StarWars provider", e);
        }
    }

    @Override
    public Planet byPlanet(String planetID) {
        try {
            return this.starWarsResource.getPlanet(planetID).execute().body();
        } catch (Exception e) {
            throw new RuntimeException("Error calling the remote StarWars provider", e);
        }
    }
}
 