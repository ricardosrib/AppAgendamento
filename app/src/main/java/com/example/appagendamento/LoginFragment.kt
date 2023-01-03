package com.example.appagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.appagendamento.model.User
import com.example.appagendamento.viewmodel.ViewModel

class LoginFragment : Fragment(R.layout.fragment_login) {

    private val args : LoginFragmentArgs by navArgs()

//    private lateinit var user: User

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonLogin = view.findViewById<Button>(R.id.loginButton)
        val buttonSignUp = view.findViewById<Button>(R.id.signUp)

        buttonLogin.setOnClickListener {

            var login = view?.findViewById<EditText>(R.id.email)?.text.toString()
            var password = view?.findViewById<EditText>(R.id.password)?.text.toString()

            if (loginValidation(login, password)) {
                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            } else {
                view?.findViewById<EditText>(R.id.email)?.text?.clear()
                view?.findViewById<EditText>(R.id.password)?.text?.clear()
                Toast.makeText(getActivity(), "Login ou senha incorretos", Toast.LENGTH_SHORT).show()
            }


//            if (loginValidation(login, password)) {
//                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
//            } else {
//                view?.findViewById<EditText>(R.id.email)?.text?.clear()
//                view?.findViewById<EditText>(R.id.password)?.text?.clear()
//                Toast.makeText(getActivity(), "Login ou senha incorretos", Toast.LENGTH_SHORT).show()
//            }


        }

        buttonSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
        }
    }

//    fun loginValidation(login: String, password: String): Boolean {
//        return login == user.loginData.email && password == user.loginData.password
//    }


    fun loginValidation(login: String, password: String): Boolean {
        val data = args.userdata
        return login == data[11] && password == data[12]
    }
}