package com.example.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("workerdocument")
    Call<ResponseBody> workerdocuments(
            @Field("phonenumber") String phonenumbmer,
            @Field("name") String name,
            @Field("password") String password,
            @Field("photoimage") String photoimage
    );
}
