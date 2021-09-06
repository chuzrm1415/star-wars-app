package TEC.DB.STARWARS;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import TEC.DB.STARWARS.Connection.IStarWarsResource;
import TEC.DB.STARWARS.Connection.StarWarsAPI;
import TEC.DB.STARWARS.Provider.IStarWarsProvider;

public class ApplicationContext {

    private final static String BASE_URL = "https://swapi.dev/api/";
    private IStarWarsResource starWarsResource;
    private StarWarsReport starWarsReport;


    public ApplicationContext() {}

    public StarWarsReport getStarWarsReport() {return this.starWarsReport;}

    public static ApplicationContext init() {
        ApplicationContext applicationcontext = new ApplicationContext();
        applicationcontext.starWarsResource = init_StarWarsResource();
        applicationcontext.starWarsReport = new StarWarsReport();



        return applicationcontext;

    }

    private static IStarWarsResource init_StarWarsResource() {
        Retrofit retrofit  = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        return retrofit.create(IStarWarsResource.class);
    }
}   