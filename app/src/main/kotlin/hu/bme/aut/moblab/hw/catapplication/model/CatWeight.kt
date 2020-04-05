package hu.bme.aut.moblab.hw.catapplication.model

import com.google.gson.annotations.SerializedName

class CatWeight {

    @SerializedName("imperial")
    var imperial: String? = null
    @SerializedName("metric")
    var metric: String? = null

}