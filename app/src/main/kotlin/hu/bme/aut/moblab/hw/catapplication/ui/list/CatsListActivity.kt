package hu.bme.aut.moblab.hw.catapplication.ui.list

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class CatsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    fun showCat(catId: String) {
        throw Exception("Not implemented")
    }

}