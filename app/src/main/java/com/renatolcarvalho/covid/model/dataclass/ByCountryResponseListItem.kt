package com.renatolcarvalho.covid.model.dataclass

import com.google.gson.annotations.SerializedName

data class ByCountryResponseListItem(
    @SerializedName("Cases")
    val cases: Int,
    @SerializedName("City")
    val city: String?,
    @SerializedName("CityCode")
    val cityCode: String?,
    @SerializedName("Country")
    val country: String,
    @SerializedName("CountryCode")
    val countryCode: String,
    @SerializedName("Date")
    val date: String,
    @SerializedName("Lat")
    val lat: String,
    @SerializedName("Lon")
    val lon: String,
    @SerializedName("Province")
    val province: String?,
    @SerializedName("Status")
    val status: String
)
