package com.example.task2.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "items_table")
data class Items (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val item : String ,
    val isChecked : Boolean = false
)