package com.example.task2.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "items_table_second")
data class ItemsSecond (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val item : String ,
    val isChecked : Boolean = false
)