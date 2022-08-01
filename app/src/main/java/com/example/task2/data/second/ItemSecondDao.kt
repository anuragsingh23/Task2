package com.example.task2.data.second

import androidx.room.*
import com.example.task2.model.Items
import com.example.task2.model.ItemsSecond
import kotlinx.coroutines.flow.Flow


@Dao
interface ItemSecondDao {

    @Query("SELECT * FROM items_table_second")
    fun getData() : Flow<List<ItemsSecond>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItems(items: ItemsSecond)

    @Delete
    suspend fun deleteItems(items: ItemsSecond)


}