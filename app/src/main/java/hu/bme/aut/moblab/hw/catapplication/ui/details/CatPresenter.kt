package hu.bme.aut.moblab.hw.catapplication.ui.details

import hu.bme.aut.moblab.hw.catapplication.interactor.CatsInteractor
import hu.bme.aut.moblab.hw.catapplication.ui.Presenter
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatDetailsScreen
import kotlinx.coroutines.launch
import javax.inject.Inject

class CatPresenter @Inject constructor(private val catsInteractor: CatsInteractor) : Presenter<CatDetailsScreen>() {

    fun loadCatBreed(id: String) {
        launch {
            screen?.showCat(catsInteractor.getCatById(id))
            screen?.showImage(catsInteractor.getImageUrlForCatById(id))
        }
    }

}