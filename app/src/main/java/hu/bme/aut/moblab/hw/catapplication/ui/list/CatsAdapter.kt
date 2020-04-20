package hu.bme.aut.moblab.hw.catapplication.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import hu.bme.aut.moblab.hw.catapplication.R
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel
import hu.bme.aut.moblab.hw.catapplication.util.CatBreedModelComparator
import kotlinx.android.synthetic.main.cats_list_card.view.*

class CatsAdapter(private val clickListener: ItemClickListener) : ListAdapter<CatBreedModel, CatsAdapter.ViewHolder>(CatBreedModelComparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cats_list_card, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.id = item.id.orEmpty()
        holder.tvCatBreedName.text = item.name
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        lateinit var id: String
        var tvCatBreedName: TextView = view.tv_cat_breed_name

        init {
            view.setOnClickListener {clickListener.onItemClick(id)}
        }
    }
}