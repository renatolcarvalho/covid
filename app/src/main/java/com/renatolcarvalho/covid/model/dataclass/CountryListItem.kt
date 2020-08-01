package com.renatolcarvalho.covid.model.dataclass

import com.google.gson.annotations.SerializedName

data class CountryListItem(
    @SerializedName("Country")
    val country: String,
    @SerializedName("ISO2")
    val iso2: String,
    @SerializedName("Slug")
    val slug: String
)
