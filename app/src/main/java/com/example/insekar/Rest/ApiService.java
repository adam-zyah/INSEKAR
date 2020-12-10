package com.example.insekar.Rest;

import com.example.insekar.Model.GetData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("api")
    Call<GetData>getData();

}
