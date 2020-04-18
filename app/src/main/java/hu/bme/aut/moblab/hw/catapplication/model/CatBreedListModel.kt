package hu.bme.aut.moblab.hw.catapplication.model

import java.util.ArrayList

class CatBreedListModel constructor(cat: CatBreedModel?) : ArrayList<CatParamModel>() {
    private val id: String = cat?.id.orEmpty()

    init {
        cat?.let {
            add("Name", it.name)
            add("Alternative names", it.altNames)
            add("Temperament", it.temperament)
            add("Life span", it.lifeSpan)
            add("Origin", it.origin)
            add("Weight", it.weightImperial)
        }
    }

    private fun add(name: String, value: String?) {
        add(CatParamModel(id, name, value))
    }
}
