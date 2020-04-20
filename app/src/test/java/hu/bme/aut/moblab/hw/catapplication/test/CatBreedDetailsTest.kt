package hu.bme.aut.moblab.hw.catapplication.test

import com.nhaarman.mockitokotlin2.KArgumentCaptor
import com.nhaarman.mockitokotlin2.argumentCaptor
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedListModel
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel
import hu.bme.aut.moblab.hw.catapplication.testInjector
import hu.bme.aut.moblab.hw.catapplication.ui.details.CatDetailsActivity
import hu.bme.aut.moblab.hw.catapplication.ui.details.CatPresenter
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.*
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.robolectric.RobolectricTestRunner
import java.lang.Exception
import javax.inject.Inject

@ExperimentalCoroutinesApi
@RunWith(RobolectricTestRunner::class)
class CatBreedDetailsTest {

    @Inject lateinit var catPresenter: CatPresenter

    @Mock lateinit var screen: CatDetailsActivity

    lateinit var catBreedListModelCaptor: KArgumentCaptor<CatBreedListModel>
    lateinit var urlCaptor: KArgumentCaptor<String>
    lateinit var factCaptor: KArgumentCaptor<String>

    @Before
    @Throws(Exception::class)
    fun init() {
        Dispatchers.setMain(TestCoroutineDispatcher())
        MockitoAnnotations.initMocks(this)
        testInjector.inject(this)
        catPresenter.attachScreen(screen)

        catBreedListModelCaptor = argumentCaptor()
        urlCaptor = argumentCaptor()
        factCaptor = argumentCaptor()
    }

    @After
    fun teardown() {
        catPresenter.detachScreen()
        Dispatchers.resetMain()
    }

    @Test
    fun testLoadingCatBreedDetailsById() = runBlocking {
        catPresenter.loadCatBreed("id0").join()

        verify(screen, times(1)).showCat(catBreedListModelCaptor.capture())
        verify(screen, times(1)).showImage(urlCaptor.capture())
        verify(screen, times(1)).showRandomFact(factCaptor.capture())
        assertEquals(CatBreedListModel(CatBreedModel("id0")), catBreedListModelCaptor.firstValue)
        assertEquals("url0", urlCaptor.firstValue)
        assertEquals("text0", factCaptor.firstValue)
    }

}