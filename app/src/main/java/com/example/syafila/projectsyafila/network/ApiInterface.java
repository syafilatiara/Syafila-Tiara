package com.example.syafila.projectsyafila.network;

import com.example.syafila.projectsyafila.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET(Constant.MOVIE_PATH + "/popular")
    Call<Movie> popularMovies(
            @Query("page") int page
    );
}
