package TEC.DB.STARWARS;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import TEC.DB.STARWARS.Connection.IStarWarsResource;
import TEC.DB.STARWARS.Provider.IStarWarsProvider;

public class ApplicationContext {

    private final static String BASE_URL = "https://swapi.dev/api/planets/";
    private IStarWarsResource starWarsResourse;


    public ApplicationContext() {}

    public static ApplicationContext init() {
        ApplicationContext applicationcontext = new ApplicationContext();
        applicationcontext.starWarsResourse = init_StarWarsResource();

        return applicationcontext;

    }

    private static IStarWarsResource init_StarWarsResource() {
        Retrofit retrofit  = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        return retrofit.create(IStarWarsResource.class);
    }


    private static StarWarsReport init_StarWarsReport(IStarWarsProvider starWarsProvider) {
        return new StarWarsReport(starWarsProvider);
    }

    
    
}