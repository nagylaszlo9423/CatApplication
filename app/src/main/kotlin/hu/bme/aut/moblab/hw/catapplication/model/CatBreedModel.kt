package hu.bme.aut.moblab.hw.catapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = CatBreedModel.TABLE_NAME)
data class CatBreedModel (
    @PrimaryKey val id: String? = null,
    @ColumnInfo(name = "name") val name: String? = null,
    @ColumnInfo(name = "temperament") val temperament: String? = null,
    @ColumnInfo(name = "life_span") val lifeSpan: String? = null,
    @ColumnInfo(name = "alt_names") val altNames: String? = null,
    @ColumnInfo(name = "wikipedia_url") val wikipediaUrl: String? = null,
    @ColumnInfo(name = "origin") val origin: String? = null,
    @ColumnInfo(name = "weight_imperial") val weightImperial: String? = null,
    @ColumnInfo(name = "experimental") val experimental: Int? = null,
    @ColumnInfo(name = "hairless") val hairless: Int? = null,
    @ColumnInfo(name = "natural") val natural: Int? = null,
    @ColumnInfo(name = "rare") val rare: Int? = null,
    @ColumnInfo(name = "rex") val rex: Int? = null,
    @ColumnInfo(name = "suppress_tail") val suppressTail: Int? = null,
    @ColumnInfo(name = "short_legs") val shortLegs: Int? = null,
    @ColumnInfo(name = "hypoallergenic") val hypoallergenic: Int? = null,
    @ColumnInfo(name = "adaptability") val adaptability: Int? = null,
    @ColumnInfo(name = "affection_level") val affectionLevel: Int? = null,
    @ColumnInfo(name = "country_core") val countryCore: String? = null,
    @ColumnInfo(name = "child_friendly") val childFriendly: Int? = null,
    @ColumnInfo(name = "dog_friendly") val dogFriendly: Int? = null,
    @ColumnInfo(name = "energy_level") val energyLevel: Int? = null,
    @ColumnInfo(name = "grooming") val grooming: Int? = null,
    @ColumnInfo(name = "health_issues") val healthIssues: Int? = null,
    @ColumnInfo(name = "intelligence") val intelligence: Int? = null,
    @ColumnInfo(name = "shedding_level") val sheddingLevel: Int? = null,
    @ColumnInfo(name = "social_needs") val socialNeeds: Int? = null,
    @ColumnInfo(name = "stranger_friendly") val strangerFriendly: Int? = null,
    @ColumnInfo(name = "vocalistaion") val vocalistaion: Int? = null
) {
    companion object {
        const val TABLE_NAME = "cat_breed"
    }
}