package com.hokaido.movies_8_myrealization;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=5RBED7A-V444WWE-QKBP08F-T8BA14K&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=1")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
