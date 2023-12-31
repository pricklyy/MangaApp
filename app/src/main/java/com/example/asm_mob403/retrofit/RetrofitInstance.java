package com.example.asm_mob403.retrofit;

import com.example.asm_mob403.retrofit.ComicService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final String BASE_URL = "http://192.168.1.109:9999/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static ComicService getApiService() {
        return retrofit.create(ComicService.class);
    }


}
