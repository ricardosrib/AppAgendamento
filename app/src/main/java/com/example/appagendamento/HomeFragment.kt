package com.example.appagendamento

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


        button1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_setDateFragment)
        }


        button2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_setDateFragment)
        }


        button3.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_setDateFragment)
        }


    }
}