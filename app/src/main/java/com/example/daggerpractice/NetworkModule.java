package com.example.daggerpractice;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Abhinav Singh on 02,June,2020
 */
@Module
public class NetworkModule {

    @Provides
    ApiService provideApiService(){
       return new Retrofit.Builder()
               .baseUrl("https://jsonplaceholder.typicode.com")
               .addConverterFactory(GsonConverterFactory.create())
               .build()
               .create(ApiService.class);
    }
}
