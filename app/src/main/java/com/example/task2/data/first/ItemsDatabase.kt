package com.example.task2.data.first

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.task2.data.second.ItemSecondDao
import com.example.task2.model.Items
import com.example.task2.model.ItemsSecond


@Database(entities = arrayOf (Items::class , ItemsSecond::class),
exportSchema = false,
version = 1)
abstract class ItemsDatabase: RoomDatabase(){

    abstract fun itemsDao(): ItemsDao
    abstract fun itemDaoSecond(): ItemSecondDao

    companion object{
        @Volatile
        private var INSTANCE : ItemsDatabase? = null

        fun getDatabase(context: Context) : ItemsDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context,
                    ItemsDatabase::class.java,
                    "Items_db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}