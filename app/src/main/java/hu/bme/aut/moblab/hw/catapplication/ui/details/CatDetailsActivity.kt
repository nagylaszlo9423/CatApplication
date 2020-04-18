package hu.bme.aut.moblab.hw.catapplication.ui.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import hu.bme.aut.moblab.hw.catapplication.R
import hu.bme.aut.moblab.hw.catapplication.injector
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedListModel
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatDetailsScreen
import kotlinx.android.synthetic.main.activity_cat_details.*
import javax.inject.Inject

class CatDetailsActivity : AppCompatActivity(), CatDetailsScreen {

    private lateinit var catAdapter: CatAdapter

    @Inject
    lateinit var catPresenter: CatPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        injector().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_details)
        catAdapter = CatAdapter()
        rv_cat_details.layoutManager = LinearLayoutManager(applicationContext)
        rv_cat_details.adapter = catAdapter
    }

    override fun onStart() {
        super.onStart()
        catPresenter.attachScreen(this)
        intent.getStringExtra(CAT_BREED_ID)?.let { catPresenter.loadCatBreed(it) }
    }

    override fun onStop() {
        catPresenter.detachScreen()
        super.onStop()
    }

    override fun showCat(cat: CatBreedListModel) {
        catAdapter.submitList(cat)
    }

    override fun showImage(url: String?) {
        url?.let { Glide.with(this).load(url).into(iv_detail) }
    }

    override fun showRandomFact(fact: String?) {
        tv_random_fact.text = fact?:"Not found any fact"
    }

    companion object {
        const val CAT_BREED_ID = "CatBreedId"
    }
}