package com.example.appagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SetDateFragment : Fragment(R.layout.fragment_set_date) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val setAppointment = view.findViewById<Button>(R.id.setAppointment)

        setAppointment.setOnClickListener {
            val data = getData2()
            findNavController().navigate(R.id.action_setDateFragment_to_overviewFragment)
        }
    }

    fun getData2(): ArrayList<String> {
        val list = ArrayList<String>()

        list.add(view?.findViewById<EditText>(R.id.date)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.time)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.address2)!!.text.toString())
        list.add(view?.findViewById<EditText>(R.id.obs)!!.text.toString())

        return list
    }
}