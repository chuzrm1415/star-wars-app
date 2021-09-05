package TEC.DB.STARWARS.StarWarsObj;

import java.util.Arrays;

public class People {

    private String name;
    private float height;
    private float mass;
    private String hair_color;
    private String eye_color;
    private String skin_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private String[] films;
    private String[] species;
    private String[] vehicles;
    private String[] starships;
    private String created;
    private String edited;
    private String url;
    


    @Override
    public String toString() {
        return "StarWarsReport{" +
                "Name = '" + name + '\'' +
                "Height = '" + height + '\'' +
                "Mass = '" + mass + '\'' +
                "Hair Color = '" + hair_color + '\'' +
                "Eye Color = '" + eye_color + '\'' +
                "Skin Color = '" + skin_color + '\'' +
                "Birth Year = '" + birth_year + '\'' +
                "Gender = '" + gender + '\'' +
                "HomeWorld = '" + homeworld + '\'' +
                "Films = '" + Arrays.toString(films) + '\'' +
                "Species = '" + Arrays.toString(species) + '\'' +
                "Vehicles = '" + Arrays.toString(vehicles) + '\'' +
                "StarShips = '" + Arrays.toString(starships) + '\'' +
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
     * @return float return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return float return the mass
     */
    public float getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(float mass) {
        this.mass = mass;
    }

    /**
     * @return String return the hair_color
     */
    public String getHair_color() {
        return hair_color;
    }

    /**
     * @param hair_color the hair_color to set
     */
    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    /**
     * @return String return the eye_color
     */
    public String getEye_color() {
        return eye_color;
    }

    /**
     * @param eye_color the eye_color to set
     */
    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    /**
     * @return String return the skin_color
     */
    public String getSkin_color() {
        return skin_color;
    }

    /**
     * @param skin_color the skin_color to set
     */
    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    /**
     * @return String return the birth_year
     */
    public String getBirth_year() {
        return birth_year;
    }

    /**
     * @param birth_year the birth_year to set
     */
    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    /**
     * @return String return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return String return the homeworld
     */
    public String getHomeworld() {
        return homeworld;
    }

    /**
     * @param homeworld the homeworld to set
     */
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
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
     * @return String[] return the species
     */
    public String[] getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String[] species) {
        this.species = species;
    }

    /**
     * @return String[] return the vehicles
     */
    public String[] getVehicles() {
        return vehicles;
    }

    /**
     * @param vehicles the vehicles to set
     */
    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * @return String[] return the starships
     */
    public String[] getStarships() {
        return starships;
    }

    /**
     * @param starships the starships to set
     */
    public void setStarships(String[] starships) {
        this.starships = starships;
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
