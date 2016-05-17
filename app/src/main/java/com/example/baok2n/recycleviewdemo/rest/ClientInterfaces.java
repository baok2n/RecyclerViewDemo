package com.example.baok2n.recycleviewdemo.rest;

import com.example.baok2n.recycleviewdemo.pojo.ListProduct;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by baok2n on 5/17/2016.
 */
public interface ClientInterfaces {
    @GET("/wc-api/v3/products")
    Call<ListProduct> getListProduct(
            @Query("consumer_key") String consumer_key,
            @Query("consumer_secret") String consumer_secret
    );
}
