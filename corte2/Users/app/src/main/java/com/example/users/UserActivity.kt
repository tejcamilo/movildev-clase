package com.example.users
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.SavedStateHandle
import com.example.users.adapters.UserAdapter
import com.example.users.viewModel.UserViewModel

class UserActivity: AppCompatActivity() {
    private val userViewModel: UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val listViewUsers = findViewById<ListView>(R.id.listViewUsers)
        val adapter = UserAdapter(this, ArrayList())
        listViewUsers.adapter = adapter
        userViewModel.allUsers.observe(this, Observer { users -> adapter.updateUsers(users) })
    }
}