package hu.bme.aut.moblab.hw.catapplication.interactor.cats

import hu.bme.aut.moblab.hw.catapplication.interactor.cats.event.GetCatsEvent
import hu.bme.aut.moblab.hw.catapplication.interactor.cats.event.GetRandomCatFactEvent
import hu.bme.aut.moblab.hw.catapplication.network.CatFactsApi
import hu.bme.aut.moblab.hw.catapplication.network.TheCatsApi
import org.greenrobot.eventbus.EventBus
import java.lang.Exception
import javax.inject.Inject

class CatsInteractor @Inject constructor(private var theCatsApi: TheCatsApi,
                                         private var catFactsApi: CatFactsApi) {

    fun getAllCats() {
        val event = GetCatsEvent()

        try {
            val allCatsCall = this.theCatsApi.getAllCats()
            val allCatsResponse = allCatsCall.execute();

            if (allCatsResponse.code() != 200) {
                throw Exception("Request failed!")
            }

            event.cats = allCatsResponse.body()
        } catch (e: Exception) {
            event.throwable = e
        } finally {
            EventBus.getDefault().post(event)
        }
    }

    fun getRandomCatFact() {
        val event = GetRandomCatFactEvent()

        try {
            val allCatsCall = this.catFactsApi.getRandomCatFact()
            val allCatsResponse = allCatsCall.execute();

            if (allCatsResponse.code() != 200) {
                throw Exception("Request failed!")
            }

            event.catFact = allCatsResponse.body()
        } catch (e: Exception) {
            event.throwable = e
        } finally {
            EventBus.getDefault().post(event)
        }
    }

}