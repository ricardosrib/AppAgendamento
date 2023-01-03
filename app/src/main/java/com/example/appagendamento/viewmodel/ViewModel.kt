package com.example.appagendamento.viewmodel

import androidx.lifecycle.ViewModel
import com.example.appagendamento.LoginFragment
import com.example.appagendamento.model.User

class ViewModel : ViewModel() {

    fun loginValidation(login: String, password: String, user: User): Boolean {
        return login == user.loginData.email && password == user.loginData.password
    }

}