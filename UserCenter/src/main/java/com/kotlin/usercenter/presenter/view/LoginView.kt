package com.kotlin.usercenter.presenter.view

import com.kotlin.baselibrary.presenter.view.BaseView

/**
 * Created by Pan on 2018/10/25.
 */
interface LoginView : BaseView {
    fun loginResult(result: Boolean)
}