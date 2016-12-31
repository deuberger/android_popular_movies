package com.deuberger.udacity.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleview_main);
        MoviePosterAdapter moviePosterAdapter = new MoviePosterAdapter();
        recyclerView.setAdapter(moviePosterAdapter);
    }
}
