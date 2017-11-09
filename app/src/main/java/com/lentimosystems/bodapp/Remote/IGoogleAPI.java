package com.lentimosystems.bodapp.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by LICIO on 11/8/2017.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);
}
