package hu.bme.aut.moblab.hw.catapplication

import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.injector(): CatApplicationComponent {
    return (applicationContext as CatApplication).component
}
