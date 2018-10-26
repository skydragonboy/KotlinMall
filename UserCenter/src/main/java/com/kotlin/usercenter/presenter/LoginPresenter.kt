package com.kotlin.usercenter.presenter

import android.accounts.Account
import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.usercenter.presenter.view.LoginView

/**
 * Created by Pan on 2018/10/25.
 */
class LoginPresenter : BasePresenter<LoginView>() {

    fun login(account: String,password:String){
        if (account == "admin" && password == "123456"){
            mView.loginResult(true)
        }else{
            mView.loginResult(false)
        }
    }
}