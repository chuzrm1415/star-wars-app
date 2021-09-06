package TEC.DB.STARWARS.Connection;

import TEC.DB.STARWARS.Provider.BaseStarWars;
import TEC.DB.STARWARS.Provider.IStarWarsProvider;
import TEC.DB.STARWARS.StarWarsObj.*;

import java.util.Optional;


public class StarWarsAPI {

    private IStarWarsResource starWarsResource;
    

    public StarWarsAPI(IStarWarsResource starWarsResource) {
        this.starWarsResource = starWarsResource;
    }


    //@Override
    public Optional<People> byPeople(String peopleID) {
        try {
            retrofit2.Call<People> peopleCall = this.starWarsResource.getPeople(peopleID);
            People peopleReport = peopleCall.execute().body();
            return Optional.of(peopleReport);
            //return Optional.of(this.starWarsResource.getPeople(peopleID).execute().body());
        } catch (Exception e) {
            throw new RuntimeException("Error calling the remote StarWars provider", e);
        }
        //return Optional.empty();
    }

    //@Override
    public Optional<Planet> byPlanet(String planetID) {
        try {
            return Optional.of(this.starWarsResource.getPlanet(planetID).execute().body());
        } catch (Exception e) {
            throw new RuntimeException("Error calling the remote StarWars provider", e);
        }
        //return Optional.empty();
    }
}
 