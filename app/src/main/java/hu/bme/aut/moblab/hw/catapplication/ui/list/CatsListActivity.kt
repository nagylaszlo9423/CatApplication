package hu.bme.aut.moblab.hw.catapplication.ui.list

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import hu.bme.aut.moblab.hw.catapplication.R
import hu.bme.aut.moblab.hw.catapplication.injector
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel
import hu.bme.aut.moblab.hw.catapplication.ui.details.CatDetailsActivity
import kotlinx.android.synthetic.main.activity_cats_list.*
import javax.inject.Inject

class CatsListActivity : AppCompatActivity(), CatsListScreen, ItemClickListener {

    private lateinit var catsAdapter: CatsAdapter

    @Inject
    lateinit var catsPresenter: CatsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        injector().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cats_list)
        catsAdapter = CatsAdapter(this)
        rv_cats_list.layoutManager = LinearLayoutManager(applicationContext)
        rv_cats_list.adapter = catsAdapter
    }

    override fun onStart() {
        super.onStart()
        catsPresenter.attachScreen(this)
        catsPresenter.loadCatBreeds()
    }

    override fun onStop() {
        catsPresenter.detachScreen()
        super.onStop()
    }

    override fun showCats(cats: List<CatBreedModel>?) {
        catsAdapter.submitList(cats)
    }

    override fun onItemClick(id: String) {
        val intent = Intent(applicationContext, CatDetailsActivity::class.java)
        intent.putExtra(CatDetailsActivity.CAT_BREED_ID, id)
        startActivity(intent)
    }

}