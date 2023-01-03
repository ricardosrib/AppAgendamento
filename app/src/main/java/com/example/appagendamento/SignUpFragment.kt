package com.example.appagendamento

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.appagendamento.model.Login
import com.example.appagendamento.model.User

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

//    private lateinit var userData: User


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonSignUp2 = view.findViewById<Button>(R.id.signUp2)
        buttonSignUp2.setOnClickListener {
            var data = getData().toTypedArray()
            val action = SignUpFragmentDirections.actionSignUpFragmentToLoginFragment(data)
            findNavController().navigate(action)

//            userData = User(view?.findViewById<EditText>(R.id.name)?.text.toString(), view?.findViewById<EditText>(R.id.birthDate)?.text.toString(), view?.findViewById<EditText>(R.id.cpf)?.text.toString(), view?.findViewById<EditText>(R.id.rg)?.text.toString(), view?.findViewById<EditText>(R.id.cep)?.text.toString(), view?.findViewById<EditText>(R.id.address)?.text.toString(), view?.findViewById<EditText>(R.id.neighbourhood)?.text.toString(), view?.findViewById<EditText>(R.id.city)?.text.toString(), view?.findViewById<EditText>(R.id.state)?.text.toString(), view?.findViewById<EditText>(R.id.country)?.text.toString(), view?.findViewById<EditText>(R.id.phoneNumber)?.text.toString(), Login(view?.findViewById<EditText>(R.id.emailSignUp)?.text.toString(), view?.findViewById<EditText>(R.id.password)?.text.toString()))
//            findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)

        }
    }


    fun getData(): ArrayList<String> {
        val list = ArrayList<String>()

        list.add(view?.findViewById<EditText>(R.id.name)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.birthDate)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.cpf)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.rg)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.cep)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.address)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.neighbourhood)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.city)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.state)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.country)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.phoneNumber)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.emailSignUp)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.password2)!!.text.toString())

        return list
    }
}