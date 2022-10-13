package com.moaimar.add.ut01.ex06.data.local

import android.content.SharedPreferences
import com.google.gson.Gson
import com.moaimar.add.ut01.ex06.domain.User

class UsersLocalDataSource(val sharedPref: SharedPreferences) {
    private val gson = Gson()
    private val editor = sharedPref.edit()


    fun saveUsers(users: List<User>){
        users.forEach{
            saveUser(it)
        }

    }
    private fun saveUser(user: User){
        val jsonUser = gson.toJson(user, User::class.java)
        val editor = sharedPref.edit()
        editor.putString(user.id.toString(),jsonUser)
        editor.apply()
    }

    fun getUsers(): List<User>{

        var userList = mutableListOf<User>()

        sharedPref.all.forEach{
            val user = gson.fromJson(it.value as String, User::class.java)
            userList.add(user)
        }
        return userList

    }

    fun findById(userId:Int): User? {
        //TODO: verificar en local sino en remoto

        val jsonUsers = sharedPref.getString(userId.toString(),null)

        return gson.fromJson(jsonUsers, User::class.java)
    }

    fun remove(userId:Int){
        //TODO (local)
        editor.remove(userId.toString())
        editor.apply()
    }
}
