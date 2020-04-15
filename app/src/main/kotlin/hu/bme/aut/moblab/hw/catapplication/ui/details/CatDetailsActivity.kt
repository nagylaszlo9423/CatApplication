package hu.bme.aut.moblab.hw.catapplication.ui.details

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import hu.bme.aut.moblab.hw.catapplication.injector

class CatDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        injector().inject(this)
        super.onCreate(savedInstanceState, persistentState)
    }

}