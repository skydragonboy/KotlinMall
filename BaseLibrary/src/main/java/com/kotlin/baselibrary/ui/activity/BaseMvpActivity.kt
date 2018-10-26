package com.kotlin.baselibrary.ui.activity

import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.baselibrary.presenter.view.BaseView

/**
 * Created by Pan on 2018/10/25.
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var mPresenter: T

    override fun hideLoading() {
    }

    override fun onError(text: String) {
    }

    override fun showLoading() {
    }

}