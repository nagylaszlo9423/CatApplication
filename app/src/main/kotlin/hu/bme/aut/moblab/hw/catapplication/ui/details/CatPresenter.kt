package hu.bme.aut.moblab.hw.catapplication.ui.list

import hu.bme.aut.moblab.hw.catapplication.interactor.cats.event.GetCatsEvent
import hu.bme.aut.moblab.hw.catapplication.ui.Presenter
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.lang.Exception

class CatPresenter : Presenter<CatListScreen>() {

    override fun attachScreen(screen: CatListScreen) {
        super.attachScreen(screen)
        throw Exception("Not implemented")
    }

    override fun detachScreen() {
        super.detachScreen()
        throw Exception("Not implemented")
    }

}