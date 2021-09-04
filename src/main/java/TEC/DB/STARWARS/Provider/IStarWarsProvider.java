package TEC.DB.STARWARS.Provider;

import TEC.DB.STARWARS.StarWarsObj.StarWarsReport;

public interface IStarWarsProvider {
    
    StarWarsReport byPeople(String peopleID);
    StarWarsReport byPlanet(String planetID);
}
