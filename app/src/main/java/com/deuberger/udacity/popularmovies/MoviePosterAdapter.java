package com.deuberger.udacity.popularmovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MoviePosterAdapter extends RecyclerView.Adapter<MoviePosterAdapter.MoviePosterViewHolder> {

    public MoviePosterAdapter () {
    }

    public class MoviePosterViewHolder extends RecyclerView.ViewHolder {
        public final TextView testView;

        public MoviePosterViewHolder(View view) {
            super(view);
            testView = (TextView) view.findViewById(R.id.test_text);
        }
    }

    @Override
    public MoviePosterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviePosterView =  inflater.inflate(R.layout.movie_poster, parent, false);
        return new MoviePosterViewHolder(moviePosterView);
    }

    @Override
    public void onBindViewHolder(MoviePosterViewHolder holder, int position) {
        holder.testView.setText("hi" + Integer.toString(position));
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
