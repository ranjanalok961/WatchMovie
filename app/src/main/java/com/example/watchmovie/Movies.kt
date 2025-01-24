package com.example.watchmovie

data class Movies(
    val id: Int,
    val name: String,
    val episode_number: Int,
    val season_number: Int,
    val season_id: Int,
    val tmdb_id: Int,
    val imdb_id: String?,
    val thumbnail_url: String?,
    val release_date: String?,
    val runtime_minutes: Int?,
    val overview: String?,
    val sources: List<Source>?
)

data class Source(
    val source_id: Int,
    val name: String,
    val type: String,
    val region: String,
    val ios_url: String?,
    val android_url: String?,
    val web_url: String?,
    val format: String?,
    val price: Double?
)