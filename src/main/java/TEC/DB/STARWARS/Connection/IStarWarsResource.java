package TEC.DB.STARWARS.Connection;

import TEC.DB.STARWARS.StarWarsObj.*;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface IStarWarsResource {

    @GET("people/{id}")
    Call<People> getPeople(@Path("id") String id);

    @GET("planets/{id}")
    Call<Planet> getPlanet(@Path("id") String id);
}
