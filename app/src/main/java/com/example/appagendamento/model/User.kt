package com.example.appagendamento.model

import android.widget.EditText

data class User(
    var name: String,
    var birthDate: String,
    var cpf: String,
    var rg: String,
    var cep: String,
    var address: String,
    var neighbourhood: String,
    var city: String,
    var state: String,
    var country: String,
    var phone: String,
    var loginData: Login
)
