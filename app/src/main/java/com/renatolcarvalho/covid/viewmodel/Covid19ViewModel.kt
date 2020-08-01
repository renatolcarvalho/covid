package com.renatolcarvalho.covid.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.renatolcarvalho.covid.model.Covid19Service
import com.renatolcarvalho.covid.model.dataclass.ByCountryResponseList
import com.renatolcarvalho.covid.model.dataclass.DayOneResponseList
import java.util.*

class Covid19ViewModel(context: Context): ViewModel() {
	private val model = Covid19Service(context)

	fun fetchCountries() = model.callGetCountries()

	fun fetchDayOne(countryName: String, status: String) = model.callService(countryName,
		status.toLowerCase(Locale.getDefault()),
		DayOneResponseList::class.java
	)
	fun fetchByCountry(countryName: String, status: String) = model.callService(countryName,
		status.toLowerCase(Locale.getDefault()),
		ByCountryResponseList::class.java
	)
}
