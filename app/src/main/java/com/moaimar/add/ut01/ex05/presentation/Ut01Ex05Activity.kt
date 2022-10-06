package com.moaimar.add.ut01.ex05.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.moaimar.add.R
import com.moaimar.add.ut01.ex05.data.UserRepository
import com.moaimar.add.ut01.ex05.data.local.UsersLocalDataSource
import com.moaimar.add.ut01.ex05.data.remote.UsersRemoteDataSource

class Ut01Ex05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex05)

        init()
    }

    private fun init(){
        //obtain all user from data layer

        val userRepository = UserRepository(
            UsersLocalDataSource(),
            UsersRemoteDataSource()
        )

        val users = userRepository.getUsers()
        Log.d("@dev", "$users")
    }
}