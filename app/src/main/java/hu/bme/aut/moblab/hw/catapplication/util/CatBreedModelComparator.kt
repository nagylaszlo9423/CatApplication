package hu.bme.aut.moblab.hw.catapplication.util

import androidx.recyclerview.widget.DiffUtil
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

object CatBreedModelComparator : DiffUtil.ItemCallback<CatBreedModel>() {
    override fun areItemsTheSame(oldItem: CatBreedModel, newItem: CatBreedModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CatBreedModel, newItem: CatBreedModel): Boolean {
        return oldItem == newItem
    }
}