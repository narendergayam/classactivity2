package com.test.myfirst.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("?format=json")
    Call<StarWar> getStarWarCall();

    @GET("E14trR2lD")
    Call<PokemonPojo> getPokemonObj();
}
