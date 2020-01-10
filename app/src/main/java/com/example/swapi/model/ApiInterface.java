package com.example.swapi.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("listUsers")
    Call<GetAllFilms> getAllFilms();
}
