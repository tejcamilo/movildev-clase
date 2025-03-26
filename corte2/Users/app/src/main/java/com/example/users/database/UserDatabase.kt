package com.example.users.database
import android.content.Context
import android.service.autofill.UserData
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDatabase:RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object{
        @Volatile
        private var INSTANCE:UserDatabase ?= null
        fun getDatabase(context: Context): UserDatabase{
            return INSTANCE ?: synchronized(this) {
            val instance = Room.inMemoryDatabaseBuilder(
                context.applicationContext,
                UserDatabase::class.java
            ).build()
            INSTANCE = instance
            instance
        }
    }}
}