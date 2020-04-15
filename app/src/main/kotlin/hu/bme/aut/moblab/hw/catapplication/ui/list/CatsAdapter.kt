package hu.bme.aut.moblab.hw.catapplication.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catapplication.R
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel

class CatsAdapter : RecyclerView.Adapter<CatsAdapter.ViewHolder>() {

    var catBreeds: List<CatBreedModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cats_list_card, parent, false))
    }

    override fun getItemCount(): Int {
        return catBreeds.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}