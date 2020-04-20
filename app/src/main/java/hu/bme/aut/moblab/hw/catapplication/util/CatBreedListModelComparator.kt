package hu.bme.aut.moblab.hw.catapplication.util

import androidx.recyclerview.widget.DiffUtil
import hu.bme.aut.moblab.hw.catapplication.model.CatParamModel

object CatBreedListModelComparator : DiffUtil.ItemCallback<CatParamModel>() {
    override fun areItemsTheSame(oldItem: CatParamModel, newItem: CatParamModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: CatParamModel,
        newItem: CatParamModel
    ): Boolean {
        return oldItem.propName == newItem.propName && oldItem.propValue == oldItem.propValue
    }
}