package com.example.appagendamento

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1 = view.findViewById<ImageButton>(R.id.lightClean)
        val button2 = view.findViewById<ImageButton>(R.id.mediumClean)
        val button3 = view.findViewById<ImageButton>(R.id.heavyClean)

        val sharedPrefType = activity?.getSharedPreferences("sharedPreferencesTypeCleaning", Context.MODE_PRIVATE)

        button1.setOnClickListener {

            val editor: SharedPreferences.Editor? = sharedPrefType?.edit()
            editor?.putString("type_cleaning", "Limpeza leve")
            editor?.apply()

            findNavController().navigate(R.id.action_homeFragment_to_setDateFragment)
        }


        button2.setOnClickListener {

            val editor: SharedPreferences.Editor? = sharedPrefType?.edit()
            editor?.putString("type_cleaning", "Limpeza média")
            editor?.apply()

            findNavController().navigate(R.id.action_homeFragment_to_setDateFragment)
        }


        button3.setOnClickListener {

            val editor: SharedPreferences.Editor? = sharedPrefType?.edit()
            editor?.putString("type_cleaning", "Limpeza pesada")
            editor?.apply()

            findNavController().navigate(R.id.action_homeFragment_to_setDateFragment)
        }


    }
}