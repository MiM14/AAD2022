package com.moaimar.add.ut01.ex06.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.moaimar.add.R
import com.moaimar.add.ut01.ex06.data.UserRepository
import com.moaimar.add.ut01.ex06.data.local.UsersLocalDataSource
import com.moaimar.add.ut01.ex06.data.remote.UsersRemoteDataSource
import com.moaimar.add.ut01.ex06.domain.User

class Ut01Ex06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01_ex06)


        val userRepository = UserRepository(
            UsersLocalDataSource(getPreferences(MODE_PRIVATE)),
            UsersRemoteDataSource()
        )

        var users = userRepository.createUsers()
        Log.d("@dev", "$users")
        val user = userRepository.findById(2)
        Log.d("@dev", "$user")

    }
}