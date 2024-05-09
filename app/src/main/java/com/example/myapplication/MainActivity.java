package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set judul untuk activity
        setTitle("Daftar Film");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Frieren","2023 Anime",R.drawable.friren2),
                new MyMovieData("The Apothecary Diaries","2023 Anime",R.drawable.ksuria),
                new MyMovieData("Horimiya","2021 Anime",R.drawable.hori),
                new MyMovieData("Jujutsu Kaisen","2017 Anime",R.drawable.jjk),
                new MyMovieData("Hunter X Hunter","2011 Anime",R.drawable.hunter)
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);
    }

}
