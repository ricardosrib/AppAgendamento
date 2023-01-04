package com.example.appagendamento

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class OverviewFragment : Fragment(R.layout.fragment_overview) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val serviceType = view?.findViewById<TextView>(R.id.serviceType)
        val date = view?.findViewById<TextView>(R.id.date2)
        val time = view?.findViewById<TextView>(R.id.time2)
        val address = view?.findViewById<TextView>(R.id.address3)

        serviceType?.text = activity?.getSharedPreferences("sharedPreferencesTypeCleaning", Context.MODE_PRIVATE)?.getString("type_cleaning", null)
        date?.text = activity?.getSharedPreferences("shared_preferences_add_info", Context.MODE_PRIVATE)?.getString("cleaning_date", null)
        time?.text = activity?.getSharedPreferences("shared_preferences_add_info", Context.MODE_PRIVATE)?.getString("cleaning_time", null)
        address?.text = activity?.getSharedPreferences("shared_preferences_add_info", Context.MODE_PRIVATE)?.getString("cleaning_address", null)
    }
}