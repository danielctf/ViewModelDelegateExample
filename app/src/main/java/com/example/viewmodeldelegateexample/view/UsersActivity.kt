package com.example.viewmodeldelegateexample.view

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.viewmodeldelegateexample.R
import com.example.viewmodeldelegateexample.viewmodel.UsersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsersActivity : AppCompatActivity() {

    private val viewModel: UsersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        observeState()

        findViewById<Button>(R.id.buttonVisits).setOnClickListener {
            viewModel.onGetVisitsClicked()
        }
        findViewById<Button>(R.id.buttonOnlineUsers).setOnClickListener {
            viewModel.onGetOnlineUsersClicked()
        }
        findViewById<Button>(R.id.buttonKickUser).setOnClickListener {
            viewModel.onKickUserClicked()
        }
    }

    private fun observeState() {
        viewModel.user.observe(this) {
            findViewById<TextView>(R.id.textUser).text = "User: $it"
        }
        viewModel.visits.observe(this) {
            findViewById<TextView>(R.id.textVisits).text = "Total visits: $it"
        }
        viewModel.onlineUsers.observe(this) {
            findViewById<TextView>(R.id.textOnlineUsers).text = it
        }
    }
}
