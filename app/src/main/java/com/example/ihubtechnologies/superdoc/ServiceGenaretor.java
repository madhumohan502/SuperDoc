package com.example.ihubtechnologies.superdoc;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenaretor {

    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://139.59.68.38:8080/jubilee_test/rest/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();



    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }


}
