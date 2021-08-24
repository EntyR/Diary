package com.example.calendar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.calendar.databinding.EventItemBinding
import com.example.calendar.room.EventEntity

class EventAdapter: androidx.recyclerview.widget.ListAdapter<EventEntity, EventAdapter.EventViewHolder>(Companion) {
    class EventViewHolder(val binding: EventItemBinding) : RecyclerView.ViewHolder(binding.root)

    companion object: DiffUtil.ItemCallback<EventEntity>(){
        override fun areItemsTheSame(oldItem: EventEntity, newItem: EventEntity): Boolean {
            return oldItem.day == newItem.day
        }

        override fun areContentsTheSame(oldItem: EventEntity, newItem: EventEntity): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(
            EventItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.binding.root.clipToOutline = true
    }
}