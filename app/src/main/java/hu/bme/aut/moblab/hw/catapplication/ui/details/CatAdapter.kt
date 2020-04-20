package hu.bme.aut.moblab.hw.catapplication.ui.details

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import hu.bme.aut.moblab.hw.catapplication.R
import hu.bme.aut.moblab.hw.catapplication.model.CatParamModel
import hu.bme.aut.moblab.hw.catapplication.util.CatBreedListModelComparator
import kotlinx.android.synthetic.main.cat_details_list_card.view.*

class CatAdapter : ListAdapter<CatParamModel, CatAdapter.ViewHolder>(CatBreedListModelComparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cat_details_list_card, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.tvPropName.text = item.propName
        holder.tvPropValue.text = item.propValue
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvPropName: TextView = view.tv_prop_name
        val tvPropValue: TextView = view.tv_prop_value
    }
}