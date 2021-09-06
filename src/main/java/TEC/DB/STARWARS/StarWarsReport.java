package TEC.DB.STARWARS;

import TEC.DB.STARWARS.StarWarsObj.*;

import java.util.Optional;

import TEC.DB.STARWARS.Connection.StarWarsAPI;

public class StarWarsReport {

    private StarWarsAPI starWarsApi;

    public StarWarsReport() { }
    
    public Optional<People> getByPeople(String peopleID) {
        var report = this.starWarsApi.byPeople(peopleID);
        return report;
    }

    public Optional<Planet> getByPlanet(String planetID) {
        var report = this.starWarsApi.byPlanet(planetID);
        return report;
    }
}