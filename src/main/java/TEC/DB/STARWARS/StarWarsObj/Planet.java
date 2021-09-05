package TEC.DB.STARWARS.StarWarsObj;

import java.util.Arrays;


public class Planet {
    
    private String name;
    private float rotation_period;
    private float orbital_period;
    private float diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private int surface_water;
    private long population;
    private String[] residents;
    private String[] films;
    private String created;
    private String edited;
    private String url;


    @Override
    public String toString() {
        return "StarWarsReport{" +
                "Name = '" + name + '\'' +
                "Rotation Period = '" + rotation_period + '\'' +
                "Orbital Period = '" + orbital_period + '\'' +
                "Diameter = '" + diameter + '\'' +
                "Climate = '" + climate + '\'' +
                "Gravity = '" + gravity + '\'' +
                "Terrain = '" + terrain + '\'' +
                "Surface Water = '" + surface_water + '\'' +
                "Population = '" + population + '\'' +
                "Residents = '" + Arrays.toString(residents) + '\'' +
                "Films = '" + Arrays.toString(films) + '\'' +
                "Created = '" + created + '\'' +
                "Edited = '" + edited + '\'' +
                "URL = '" + url +
                '}';
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return float return the rotation_period
     */
    public float getRotation_period() {
        return rotation_period;
    }

    /**
     * @param rotation_period the rotation_period to set
     */
    public void setRotation_period(float rotation_period) {
        this.rotation_period = rotation_period;
    }

    /**
     * @return float return the orbital_period
     */
    public float getOrbital_period() {
        return orbital_period;
    }

    /**
     * @param orbital_period the orbital_period to set
     */
    public void setOrbital_period(float orbital_period) {
        this.orbital_period = orbital_period;
    }

    /**
     * @return float return the diameter
     */
    public float getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    /**
     * @return String return the climate
     */
    public String getClimate() {
        return climate;
    }

    /**
     * @param climate the climate to set
     */
    public void setClimate(String climate) {
        this.climate = climate;
    }

    /**
     * @return String return the gravity
     */
    public String getGravity() {
        return gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    /**
     * @return String return the terrain
     */
    public String getTerrain() {
        return terrain;
    }

    /**
     * @param terrain the terrain to set
     */
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    /**
     * @return int return the surface_water
     */
    public int getSurface_water() {
        return surface_water;
    }

    /**
     * @param surface_water the surface_water to set
     */
    public void setSurface_water(int surface_water) {
        this.surface_water = surface_water;
    }

    /**
     * @return long return the population
     */
    public long getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     * @return String[] return the residents
     */
    public String[] getResidents() {
        return residents;
    }

    /**
     * @param residents the residents to set
     */
    public void setResidents(String[] residents) {
        this.residents = residents;
    }

    /**
     * @return String[] return the films
     */
    public String[] getFilms() {
        return films;
    }

    /**
     * @param films the films to set
     */
    public void setFilms(String[] films) {
        this.films = films;
    }

    /**
     * @return String return the created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return String return the edited
     */
    public String getEdited() {
        return edited;
    }

    /**
     * @param edited the edited to set
     */
    public void setEdited(String edited) {
        this.edited = edited;
    }

    /**
     * @return String return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
