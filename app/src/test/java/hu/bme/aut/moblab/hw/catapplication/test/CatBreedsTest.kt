package hu.bme.aut.moblab.hw.catapplication.test

import com.nhaarman.mockitokotlin2.KArgumentCaptor
import com.nhaarman.mockitokotlin2.argumentCaptor
import hu.bme.aut.moblab.hw.catapplication.mock.MockCatBreedDao
import hu.bme.aut.moblab.hw.catapplication.model.CatBreedModel
import hu.bme.aut.moblab.hw.catapplication.testInjector
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatsListActivity
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatsListScreen
import hu.bme.aut.moblab.hw.catapplication.ui.list.CatsPresenter
import kotlinx.coroutines.*
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertArrayEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.robolectric.RobolectricTestRunner
import java.lang.Exception
import javax.inject.Inject

@ExperimentalCoroutinesApi
@RunWith(RobolectricTestRunner::class)
class CatBreedsTest {

    @Inject lateinit var catsPresenter: CatsPresenter

    @Mock lateinit var screen: CatsListScreen

    lateinit var captor: KArgumentCaptor<List<CatBreedModel>>

    @Before
    @Throws(Exception::class)
    fun init(){
        Dispatchers.setMain(TestCoroutineDispatcher())
        MockitoAnnotations.initMocks(this)
        testInjector.inject(this)
        catsPresenter.attachScreen(screen)
        captor = argumentCaptor()
    }

    @After
    fun teardown() {
        catsPresenter.detachScreen()
        Dispatchers.resetMain()
    }

    @Test
    fun testLoadingCatBreeds() = runBlocking {
        catsPresenter.loadCatBreeds().join()

        verify(screen, times(1)).showCats(captor.capture())
        assertArrayEquals(arrayOf(MockCatBreedDao.getAll()), arrayOf(captor.firstValue))
    }

}