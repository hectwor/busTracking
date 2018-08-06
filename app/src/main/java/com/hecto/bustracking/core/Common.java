package com.hecto.bustracking.core;

import com.hecto.bustracking.data.remote.IGoogleApi;
import com.hecto.bustracking.data.remote.RetrofitClient;

public class Common {
    private static final String baseURL = "https://googleapis.com";
    public static IGoogleApi getGoogleApi()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
