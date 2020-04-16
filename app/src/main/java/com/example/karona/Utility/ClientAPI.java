package com.example.karona.Utility;

import com.example.karona.Charts.Model.CHartResponse;
import com.example.karona.Essential.Model.EssentialResponse;
import com.example.karona.HomeScreen.Model.TravelResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ClientAPI {
    @GET(Constants.RESOURCE_DATA)
    Call<EssentialResponse> getResourceData();

    @GET(Constants.TRAVEL_DATA)
    Call<TravelResponse> getTraveldata();

    @GET(Constants.ALL_DATA)
    Call<CHartResponse> getChartData();
}
