package com.renatolcarvalho.covid.model

import com.renatolcarvalho.covid.model.dataclass.ByCountryResponseList
import com.renatolcarvalho.covid.model.dataclass.DayOneResponseList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

object Covid19Api {
    val BASE_URL = "https://api.covid19api.com/"

    /*"Name": "Get List Of Countries",
    "Description": "Returns all countries and associated provinces. The country_slug variable is used for country specific data",
    "Path": "/countries",
    "Params": null*/
    val COUNTRIES_ENDPOINT = "countries"

    interface RetrofitServices {
        /*"Name": "Get List Of Cases Per Country Per Province By Case Type From The First Recorded Case",
        "Description": "Returns all cases by case type for a country from the first recorded case. Country must be the country_slug from /countries. Cases must be one of: confirmed, recovered, deaths",
        "Path": "/dayone/country/{country}/status/{status}",
        "Params": [
            "country",
            "status"
        ]*/
        @GET("dayone/country/{countryName}/status/{status}")
        fun getDayOne(
            @Path("countryName") countryName: String,
            @Path("status") status: String
        ): Call<DayOneResponseList>

        /*"Name": "Get List Of Cases Per Country Per Province By Case Type",
        "Description": "Returns all cases by case type for a country. Country must be the country_slug from /countries. Cases must be one of: confirmed, recovered, deaths",
        "Path": "/country/{country}/status/{status}",
        "Params": [
            "country",
            "status"
        ]*/
        @GET("country/{countryName}/status/{status}")
        fun getByCountry(
            @Path("countryName") countryName: String,
            @Path("status") status: String
        ): Call<ByCountryResponseList>
    }
}
