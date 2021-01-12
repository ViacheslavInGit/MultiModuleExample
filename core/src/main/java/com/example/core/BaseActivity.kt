package com.example.core

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.core.navigation.BaseRouter
import com.example.core.navigation.ScreensProvider
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder

abstract class BaseActivity<B : ViewDataBinding>(
    @LayoutRes private val layoutId: Int
) : AppCompatActivity() {

    protected val router: BaseRouter by inject()
    protected val screensProvider: ScreensProvider by inject()

    protected abstract val navigator: Navigator
    private val navigatorHolder: NavigatorHolder by inject()

    private var viewBinding: B? = null
    protected val binding: B
        get() = viewBinding
            ?: throw IllegalStateException("Trying to access the binding outside of the view lifecycle.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.inflate(layoutInflater, layoutId, null, false)
        setContentView(binding.root)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}