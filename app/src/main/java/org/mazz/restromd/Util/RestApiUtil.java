package org.mazz.restromd.Util;


import org.mazz.restromd.Builder.RetrofitApiBuilder;
import org.mazz.restromd.Service.RestApiService;

public class RestApiUtil {

    private static final String BASE_URL = "http://192.168.1.120:8090/";
   // private static final String BASE_URL = "http://192.168.225.112:8080/";

    public static RestApiService getServiceClass(String restUrl){

        return RetrofitApiBuilder.getRetrofit(restUrl).create(RestApiService.class);
    }
}
