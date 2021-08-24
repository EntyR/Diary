package com.example.calendar.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.calendar.other.EventStatus


data class DayEntity(val day: String, val status: EventStatus = EventStatus.NoEvent) {

}