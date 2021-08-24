package com.example.calendar.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EventDao {
    @Query("SELECT * FROM events")
    fun getAllEvent(): LiveData<EventEntity>

    @Delete
    fun deleteEvent(event: EventEntity)

    @Insert
    fun addEvent(event: EventEntity)
}