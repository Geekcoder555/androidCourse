package me.leofontes.retrofittutorial;

import me.leofontes.retrofittutorial.Models.UdacityCatalog;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by leo on 24/10/16.
 */

public interface UdacityService {
    public static final String BASE_URL = "https://www.udacity.com/public-api/v0/";

    @GET("courses")
    Call<UdacityCatalog> listCatalog();
}
