package hu.bme.aut.moblab.hw.catapplication.ui.details

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ListAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import hu.bme.aut.moblab.hw.catapplication.injector
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedListModel
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatDetailsScreen
import kotlinx.android.synthetic.main.activity_cat_details.*
import javax.inject.Inject

class CatDetailsActivity : AppCompatActivity(), CatDetailsScreen {

    private lateinit var catAdapter: CatAdapter

    @Inject
    lateinit var catPresenter: CatPresenter

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        injector().inject(this)
        super.onCreate(savedInstanceState, persistentState)
        catAdapter = CatAdapter()
        rv_cat_details.layoutManager = LinearLayoutManager(applicationContext)
        rv_cat_details.adapter = catAdapter
        catPresenter.attachScreen(this)
        intent.getStringExtra(CAT_BREED_ID).let { catPresenter.loadCatBreed(it) }
    }

    override fun onStop() {
        catPresenter.detachScreen()
        super.onStop()
    }

    override fun showCat(cat: CatBreedListModel) {
        catAdapter.submitList(cat)
    }

    companion object {
        const val CAT_BREED_ID = "CatBreedId"
    }
}