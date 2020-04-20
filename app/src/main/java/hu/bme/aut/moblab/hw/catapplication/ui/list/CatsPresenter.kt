package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.interactor.CatsInteractor
import hu.bme.aut.moblab.hw.catapplication.ui.Presenter
import kotlinx.coroutines.launch
import javax.inject.Inject

class CatsPresenter @Inject constructor(private val catsInteractor: CatsInteractor) :
    Presenter<CatsListScreen>() {

    fun loadCatBreeds() = launch {
        screen?.showCats(catsInteractor.getAllCats())
    }

}