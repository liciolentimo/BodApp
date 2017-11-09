package com.lentimosystems.bodapp.Common;

import com.lentimosystems.bodapp.Remote.IGoogleAPI;
import com.lentimosystems.bodapp.Remote.RetrofitClient;

/**
 * Created by LICIO on 11/8/2017.
 */

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
