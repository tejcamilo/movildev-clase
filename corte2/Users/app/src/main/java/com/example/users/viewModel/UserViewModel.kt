package com.example.users.viewModel
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.users.database.User
import com.example.users.database.UserDatabase
import com.example.users.repositories.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(application: Application):AndroidViewModel(application) {
    private val repository:UserRepository
    val allUsers: LiveData<List<User>>

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        allUsers = repository.allUser
    }

    fun insert(user: User) = viewModelScope.launch {
        repository.insert(user)
    }

    fun delete(user: User) = viewModelScope.launch {
        repository.delete(user)
    }
}