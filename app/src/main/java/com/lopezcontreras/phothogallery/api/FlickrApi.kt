package com.lopezcontreras.phothogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "e6e70d348202db3ed4740a7015e7ac31"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}