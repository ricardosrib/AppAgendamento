package com.example.appagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SetDateFragment : Fragment(R.layout.fragment_set_date) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val setAppointment = view.findViewById<Button>(R.id.setAppointment)

        setAppointment.setOnClickListener {
            findNavController().navigate(R.id.action_setDateFragment_to_overviewFragment)
        }

    }
}