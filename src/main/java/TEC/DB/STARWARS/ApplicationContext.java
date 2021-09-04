package TEC.DB.STARWARS;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import TEC.DB.STARWARS.Connection.IStarWarsResourse;

public class ApplicationContext {

    private final static String BASE_URL = "https://swapi.dev/api/planets/";
    private IStarWarsResourse starWarsResourse;


    public ApplicationContext() {}

    public static ApplicationContext init() {
        ApplicationContext applicationcontext = new ApplicationContext();
        applicationcontext.starWarsResourse = init_StarWarsResource();

        return applicationcontext;

    }

    private static IStarWarsResourse init_StarWarsResource() {
        Retrofit retrofit  = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        return retrofit.create(IStarWarsResourse.class);
    }

    
    
}
