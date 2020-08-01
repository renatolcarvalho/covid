package com.renatolcarvalho.covid.model.dataclass

import com.google.gson.annotations.SerializedName

data class DayOneResponseListItem(
    @SerializedName("Cases")
    val cases: Int,
    @SerializedName("Country")
    val country: String,
    @SerializedName("Date")
    val date: String,
    @SerializedName("Lat")
    val lat: Double,
    @SerializedName("Lon")
    val lon: Double,
    @SerializedName("CountryCode")
    val countryCode: String,
    @SerializedName("Status")
    val status: String
)
