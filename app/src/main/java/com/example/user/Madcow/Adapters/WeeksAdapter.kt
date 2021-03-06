package com.example.user.Madcow.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.user.Madcow.Model.Training
import com.example.user.Madcow.R
import kotlinx.android.synthetic.main.week_item.view.*

/**
 * Created by User on 2018-06-20.
 */
class WeeksAdapter(val items: List<Training>, val clickListener: (Training) -> Unit) : RecyclerView.Adapter<WeeksAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.week_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.weekNumberText.text = items[position].week.toString()
        holder.weekDatesText.text = items[position].date.toString()
        holder.nextButton.setOnClickListener { clickListener(items[position])}


    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val weekNumberText = view.week_number
        val weekDatesText = view.week_dates
        val nextButton = view.show_week

    }

}