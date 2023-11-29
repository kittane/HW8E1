package com.frey.msu.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "0e0784a926f892c475033cc2861705e3"

interface FlickrApi {
    // @GET("/")

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    //suspend fun fetchContents():String
    suspend fun fetchPhotos():String
}