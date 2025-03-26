package com.example.users.repositories
import androidx.lifecycle.LiveData
import com.example.users.database.User
import com.example.users.database.UserDao

class UserRepository(private val userDao: UserDao) {
    val allUser: LiveData<List<User>> = userDao.getAllUsers()
    suspend fun insert(user: User){
        userDao.insert(user)
    }
    suspend fun delete(user: User){
        userDao.delete(user)
    }
}