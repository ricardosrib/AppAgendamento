package com.example.appagendamento

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Profile

        val profileName = view?.findViewById<TextView>(R.id.nameProfile)
        val profileCity = view?.findViewById<TextView>(R.id.cityProfile)
//        val profileState = view?.findViewById<TextView>(R.id.stateProfile)

        profileName?.text = activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)?.getString("name", null)
        profileCity?.text = activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)?.getString("city", null)
//        profileState?.text = activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)?.getString("state", null)


        // Recycler view



    }
}