package com.example.baok2n.recycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baok2n.recycleviewdemo.adapter.ProductListAdapter;
import com.example.baok2n.recycleviewdemo.pojo.ListProduct;
import com.example.baok2n.recycleviewdemo.rest.ClientInterfaces;
import com.example.baok2n.recycleviewdemo.rest.ServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    // declare recyclerview
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // View binding
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_product_list);
        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        // Create a very simple REST adapter which points the GitHub API endpoint.
        ClientInterfaces client = ServiceGenerator.createService(ClientInterfaces.class);

        // Fetch and print a list of the contributors to this library.
        Call<ListProduct> call =
                client.getListProduct("ck_b5d038505f94dec281d5262d703c2d29fff270b9", "cs_259e4f89149b7321549f3d2503c7afc49e55f859");

        call.enqueue(new Callback<ListProduct>() {
            @Override
            public void onResponse(Call<ListProduct> call, Response<ListProduct> response) {
                if (response.isSuccessful()) {
                    ListProduct listProduct = response.body();
                    //System.out.println(listProduct.getListProduct());
                    recyclerViewAdapter = new ProductListAdapter(listProduct.getListProduct());
                    recyclerView.setAdapter(recyclerViewAdapter);

                }else {
                    System.err.println(response.message());
                }

            }

            @Override
            public void onFailure(Call<ListProduct> call, Throwable t) {
                System.err.println(t.getMessage());
            }
        });


    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
