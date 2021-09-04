package TEC.DB.STARWARS.Connection;

import TEC.DB.STARWARS.StarWarsObj.*;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import java.util.Map;


public interface IStarWarsResourse {

    @GET("people/{id}")
    Call<StarWarsReport> getPeople(@QueryMap Map<String, String> options);

    @GET("planets/{id}")
    Call<StarWarsReport> getPlanet(@QueryMap Map<String, String> options);
}
