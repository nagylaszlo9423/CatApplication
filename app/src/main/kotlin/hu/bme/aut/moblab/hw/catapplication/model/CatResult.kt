package hu.bme.aut.moblab.hw.catapplication.model

import com.google.gson.annotations.SerializedName

class CatResult {

    @SerializedName("adaptability")
    var adaptability: Int? = null
    @SerializedName("affection_level")
    var affectionLevel: Int? = null
    @SerializedName("alt_names")
    var altNames: String? = null
    @SerializedName("cfa_url")
    var cfaUrl: String? = null
    @SerializedName("child_friendly")
    var childFriendly: Int? = null
    @SerializedName("country_code")
    var countryCode: String? = null
    @SerializedName("country_codes")
    var countryCodes: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("dog_friendly")
    var dogFriendly: String? = null
    @SerializedName("energy_level")
    var energyLevel: Int? = null
    @SerializedName("experimental")
    var experimental: Int? = null
    @SerializedName("grooming")
    var grooming: String? = null
    @SerializedName("hairless")
    var hairless: Int? = null
    @SerializedName("health_issues")
    var healthIssues: Int? = null
    @SerializedName("hypoallergenic")
    var hypoallergenic: Int? = null
    @SerializedName("id")
    var id: String? = null
    @SerializedName("indoor")
    var indoor: Int? = null
    @SerializedName("intelligence")
    var intelligence: Int? = null
    @SerializedName("lap")
    var lap: Int? = null
    @SerializedName("life_span")
    var lifeSpan: String? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("natural")
    var natural: Int? = null
    @SerializedName("origin")
    var origin: String? = null
    @SerializedName("rare")
    var rare: Int? = null
    @SerializedName("rex")
    var rex: Int? = null
    @SerializedName("shedding_level")
    var sheddingLevel: Int? = null
    @SerializedName("short_legs")
    var shortLegs: String? = null
    @SerializedName("social_needs")
    var socialNeeds: Int? = null
    @SerializedName("stranger_friendly")
    var strangerFriendly: Int? = null
    @SerializedName("suppressed_tail")
    var suppressedTail: Int? = null
    @SerializedName("temperament")
    var temperament: String? = null
    @SerializedName("vcahospitals_url")
    var vcahospitalsUrl: String? = null
    @SerializedName("vetstreet_url")
    var vetstreetUrl: String? = null
    @SerializedName("vocalisation")
    var vocalisation: Int? = null
    @SerializedName("weight")
    var weight: CatWeight? = null
    @SerializedName("wikipedia_url")
    var wikipediaUrl: String? = null

}