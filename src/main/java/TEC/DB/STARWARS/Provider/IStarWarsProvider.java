package TEC.DB.STARWARS.Provider;

import TEC.DB.STARWARS.StarWarsObj.*;
import java.util.Optional;

public interface IStarWarsProvider {
    
    People byPeople(String peopleID);
    Planet byPlanet(String planetID);
}
