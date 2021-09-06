package TEC.DB.STARWARS;

import TEC.DB.STARWARS.StarWarsObj.*;
import TEC.DB.STARWARS.Provider.IStarWarsProvider;



public class StarWarsReport {

    private IStarWarsProvider starWarsProvider;

    public StarWarsReport(IStarWarsProvider starWarsProvider) { 
        this.starWarsProvider = starWarsProvider;
    }
    
    public People getByPeople(String peopleID) {
        var report = this.starWarsProvider.byPeople(peopleID);
        return report;
    }

    public Planet getByPlanet(String planetID) {
        var report = this.starWarsProvider.byPlanet(planetID);
        return report;
    }
}