package com.puitiza.rxjava.Retrofit;



import com.puitiza.rxjava.Model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
