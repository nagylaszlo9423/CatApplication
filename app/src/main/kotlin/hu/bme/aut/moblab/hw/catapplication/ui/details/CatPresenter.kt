package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.interactor.cats.CatsInteractor
import hu.bme.aut.moblab.hw.catapplication.ui.Presenter
import java.lang.Exception
import javax.inject.Inject

class CatPresenter @Inject constructor(catsInteractor: CatsInteractor) : Presenter<CatListScreen>() {

    override fun attachScreen(screen: CatListScreen) {
        super.attachScreen(screen)
        throw Exception("Not implemented")
    }

    override fun detachScreen() {
        super.detachScreen()
        throw Exception("Not implemented")
    }

}