package com.example.ihubtechnologies.superdoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ServiceCalls client;
    InternetConnection internetConnection;
    RecyclerView recyclerView;
    DataAdapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        client = ServiceGenaretor.createService(ServiceCalls.class);
        internetConnection = new InternetConnection(MainActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.id_list);

        if (internetConnection.hasConnection()) {
//            Call<ArrayList<DataResPonse>> data = client.getData("1");
//            data.enqueue(new Callback<ArrayList<DataResPonse>>() {
//                @Override
//                public void onResponse(Call<ArrayList<DataResPonse>> call, Response<ArrayList<DataResPonse>> response) {
//                    recyclerView.setHasFixedSize(true);
//                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//                    madapter = new DataAdapter(MainActivity.this, response.body());
//                    recyclerView.setAdapter(madapter);
//                }
//
//                @Override
//                public void onFailure(Call<ArrayList<DataResPonse>> call, Throwable t) {
//                    Log.d("madhu", t.getMessage());
//
//                }
//            });
            PostDataReq postDataReq = new PostDataReq(1,7);
            Call<ArrayList<PostDataResponce>> data = client.getPostData(postDataReq);
            data.enqueue(new Callback<ArrayList<PostDataResponce>>() {
                @Override
                public void onResponse(Call<ArrayList<PostDataResponce>> call, Response<ArrayList<PostDataResponce>> response) {
                    Toast.makeText(MainActivity.this,"done",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<ArrayList<PostDataResponce>> call, Throwable t) {
                    Log.d("madhu", t.getMessage());
                }
            });
        } else {
            Toast.makeText(MainActivity.this, "no connection", Toast.LENGTH_SHORT).show();
        }
    }
}
