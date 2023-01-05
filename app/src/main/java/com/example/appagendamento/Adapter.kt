package com.example.appagendamento

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appagendamento.model.CardModel

class Adapter(val items: MutableList<CardModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val serviceType = itemView.findViewById<TextView>(R.id.serviceType2)
        val cleaningDate = itemView.findViewById<TextView>(R.id.date3)
        val cleaningTime = itemView.findViewById<TextView>(R.id.time3)
        val cleaningAddress = itemView.findViewById<TextView>(R.id.address4)

        fun bind(item: CardModel) {
            serviceType.text = itemView.context.getSharedPreferences("sharedPreferencesTypeCleaning", Context.MODE_PRIVATE).getString("type_cleaning", null)
            cleaningDate.text = itemView.context.getSharedPreferences("shared_preferences_add_info", Context.MODE_PRIVATE).getString("cleaning_date", null)
            cleaningTime.text = itemView.context.getSharedPreferences("shared_preferences_add_info", Context.MODE_PRIVATE).getString("cleaning_time", null)
            cleaningAddress.text = itemView.context.getSharedPreferences("shared_preferences_add_info", Context.MODE_PRIVATE).getString("cleaning_address", null)
        }
    }
}