package com.example.terrariumapp1710;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("terrariums/1")
    Call<BackendTerrarium> getTerrarium();
}
