package hu.bme.aut.moblab.hw.catapplication.ui.list

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catapplication.R
import hu.bme.aut.moblab.hw.catapplication.injector
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel
import kotlinx.android.synthetic.main.activity_cats_list.*
import java.lang.Exception
import javax.inject.Inject

class CatsListActivity @Inject constructor(
    private val catsPresenter: CatsPresenter
) : AppCompatActivity(), CatsListScreen {

    private lateinit var catsAdapter: CatsAdapter

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        injector().inject(this)
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_cats_list)
        catsAdapter = CatsAdapter()
        rv_cats_list.adapter = catsAdapter
        catsPresenter.loadCatBreeds()
    }

    override fun showCats(cats: List<CatBreedModel>?) {
        if (!cats.isNullOrEmpty()) {
            catsAdapter.catBreeds = cats
        }
    }

}