package com.example.task2.data.first

import androidx.room.*
import com.example.task2.model.Items
import kotlinx.coroutines.flow.Flow


@Dao
interface ItemsDao {

    @Query("SELECT * FROM items_table")
    fun getData() : Flow<List<Items>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItems(items: Items)

    @Delete
    suspend fun deleteItems(items: Items)


}