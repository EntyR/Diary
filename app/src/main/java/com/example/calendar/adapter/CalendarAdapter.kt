package com.example.calendar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.calendar.R
import com.example.calendar.databinding.DayItemBinding
import com.example.calendar.other.EventStatus
import com.example.calendar.room.DayEntity

class CalendarAdapter :
    androidx.recyclerview.widget.ListAdapter<DayEntity, CalendarAdapter.CalendarViewHolder>(
        Companion
    ) {
    class CalendarViewHolder(val binding: DayItemBinding) : RecyclerView.ViewHolder(binding.root)

    companion object : DiffUtil.ItemCallback<DayEntity>() {
        override fun areItemsTheSame(oldItem: DayEntity, newItem: DayEntity): Boolean {
            return oldItem.day == newItem.day
        }

        override fun areContentsTheSame(oldItem: DayEntity, newItem: DayEntity): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        return CalendarViewHolder(
            DayItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        val day = currentList[position]
        holder.binding.singleDay.text = currentList[position].day
        val circle = holder.binding.imageView
        when (day.status) {
            EventStatus.NoEvent -> circle.isInvisible = true
            EventStatus.EventEnded -> circle.setImageResource(R.drawable.ic_circle_green_24)
            EventStatus.EventAwait -> circle.setImageResource(R.drawable.ic_circle_blue_24)
            EventStatus.EventToday -> circle.setImageResource(R.drawable.ic_circle_red_24)
        }
    }
}