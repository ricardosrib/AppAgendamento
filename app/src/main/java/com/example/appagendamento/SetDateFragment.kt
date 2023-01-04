package com.example.appagendamento

import android.content.Context
import android.content.SharedPreferences
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

        val sharedPrefAdditionalInfo = activity?.getSharedPreferences("shared_preferences_add_info", Context.MODE_PRIVATE)

        val setAppointment = view.findViewById<Button>(R.id.setAppointment)

        setAppointment.setOnClickListener {
            val data = getData2()

            val editor: SharedPreferences.Editor? = sharedPrefAdditionalInfo?.edit()
            editor?.putString("cleaning_date", data[0])
            editor?.putString("cleaning_time", data[1])
            editor?.putString("cleaning_address", data[2])
            editor?.putString("cleaning_obs", data[3])
            editor?.apply()

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