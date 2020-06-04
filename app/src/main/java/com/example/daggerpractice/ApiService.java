package com.example.daggerpractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Abhinav Singh on 02,June,2020
 */
public interface ApiService {
    @GET("/posts")
    Call<List<Post>> getPosts();
}
