package com.example.watchmovie

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {
    @Headers(
        "x-rapidapi-key: d8364edc31msh8b923d7742a56f8p103aa1jsnfe5c61ef2e81",
        "x-rapidapi-host: watchmode.p.rapidapi.com"
    )
    @GET("title/3173903/episodes/")
    suspend fun getEpisodes(): List<Movies>
}