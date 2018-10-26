package com.kotlin.baselibrary.presenter

import com.kotlin.baselibrary.presenter.view.BaseView

/**
 * Created by Pan on 2018/10/25.
 */
open class BasePresenter<T: BaseView> {


    lateinit var mView: T

}