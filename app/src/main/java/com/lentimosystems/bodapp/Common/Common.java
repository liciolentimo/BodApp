package com.lentimosystems.bodapp.Common;

import com.lentimosystems.bodapp.Remote.FCMClient;
import com.lentimosystems.bodapp.Remote.IFCMService;
import com.lentimosystems.bodapp.Remote.IGoogleAPI;
import com.lentimosystems.bodapp.Remote.RetrofitClient;

/**
 * Created by LICIO on 11/8/2017.
 */

public class Common {
   // public static String currentToken = "";

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";


    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com";
    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
