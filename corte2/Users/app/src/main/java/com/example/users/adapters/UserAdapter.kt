package com.example.users.adapters
import android.content.Context
import android.view.*
import android.widget.*
import androidx.annotation.LayoutRes
import com.example.users.database.User
import com.example.users.R

class UserAdapter(private val context: Context, private var users: List<User>): BaseAdapter() {
    override fun getCount(): Int = users.size
    override fun getItem(position: Int): Any = users[position].id-hashCode().toLong()
    override fun getItemId(position: Int): Long = users[position].id.hashCode().toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view =
            convertView ?: LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        val textName = view.findViewById<TextView>(R.id.textName)
        val textEmail = view.findViewById<TextView>(R.id.textEmail)
        val user = users[position]
        textName.text = user.name
        textEmail.text = user.email
        return view


    }
    fun updateUsers(newUsers: List<User>?) {
        if (newUsers != null) {
            users = newUsers
        }
        notifyDataSetChanged()
    }
}

