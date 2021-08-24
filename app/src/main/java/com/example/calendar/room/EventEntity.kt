package com.example.calendar.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.calendar.other.EventStatus

@Entity(tableName = "events")
data class EventEntity(
    val day: String,
    val status: EventStatus,
    val title: String
) {
    @PrimaryKey(autoGenerate = true)
    var key: Int? = null
}