package com.example.swapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.swapi.model.GetAllFilms;
import com.example.swapi.model.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView;

        Call<GetAllFilms> call = RetrofitClient.getInstance().getApi().getAllFilms();
        call.enqueue(new Callback<GetAllFilms>() {
            @Override
            public void onResponse(Call<GetAllFilms> call, Response<GetAllFilms> response) {
                Log.d("Apicall",":Success");

            }

            @Override
            public void onFailure(Call<GetAllFilms> call, Throwable t) {
                Log.d("Apicall",":failure:"+t.getMessage());
            }
        });
    }
}
