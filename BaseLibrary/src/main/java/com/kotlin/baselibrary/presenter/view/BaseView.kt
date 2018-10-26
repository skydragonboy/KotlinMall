package com.kotlin.baselibrary.presenter.view

/**
 * Created by Pan on 2018/10/25.
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(text: String)
}