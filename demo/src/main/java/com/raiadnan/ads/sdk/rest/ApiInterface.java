package com.raiadnan.ads.sdk.rest;

import com.raiadnan.ads.sdk.callback.CallbackConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiInterface {

    String CACHE = "Cache-Control: max-age=0";
    String AGENT = "Data-Agent: ShaheenDevelopers";

    @Headers({CACHE, AGENT})
    @GET
    Call<CallbackConfig> getJsonUrl(
            @Url String url
    );

    @Headers({CACHE, AGENT})
    @GET("uc?export=download")
    Call<CallbackConfig> getDriveJsonFileId(
            @Query("id") String id
    );

}