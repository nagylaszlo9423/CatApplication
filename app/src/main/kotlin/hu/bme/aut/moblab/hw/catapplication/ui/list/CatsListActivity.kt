package hu.bme.aut.moblab.hw.catapplication.ui.list

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import hu.bme.aut.moblab.hw.catapplication.injector
import java.lang.Exception

class CatsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        injector().inject(this)
        super.onCreate(savedInstanceState, persistentState)
    }

    fun showCat(catId: String) {
        throw Exception("Not implemented")
    }

}