package com.example.ihubtechnologies.superdoc;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ServiceCalls {
    @GET("SpecialityDescription/get")
    Call<ArrayList<DataResPonse>> getData(@Query("locid") String locid);

    @POST("appointments/getDoctorDetails")
    Call<ArrayList<PostDataResponce>> getPostData(@Body PostDataReq postDataReq);
}
