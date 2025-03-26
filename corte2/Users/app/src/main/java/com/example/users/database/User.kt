package com.example.users.database
import androidx.lifecycle.LiveData
import androidx.room.*

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0, // usamos @ para declarar anotaciones
    val name: String,
    val email: String,

)
