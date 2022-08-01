package com.example.task2.repository

import com.example.task2.data.first.ItemsDao
import com.example.task2.data.second.ItemSecondDao
import com.example.task2.model.Items
import com.example.task2.model.ItemsSecond
import kotlinx.coroutines.flow.Flow

class NoteRepository(
    private val dao: ItemsDao ,
    private val daoSecond: ItemSecondDao
) {

    suspend fun insertItem(items: Items) {
        dao.insertItems(items)
    }

    suspend fun deleteItem(items: Items){
        dao.deleteItems(items)
    }

    fun getAllItem(items: Items) : Flow<List<Items>> =
        dao.getData()

    suspend fun insertItemSecond(items: ItemsSecond) {
        daoSecond.insertItems(items)
    }

    suspend fun deleteItem(items: ItemsSecond){
        daoSecond.deleteItems(items)
    }

    fun getAllItem() : Flow<List<ItemsSecond>> = daoSecond.getData()
}