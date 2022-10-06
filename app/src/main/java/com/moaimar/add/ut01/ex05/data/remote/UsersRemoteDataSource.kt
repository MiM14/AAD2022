package com.moaimar.add.ut01.ex05.data.remote

import com.moaimar.add.ut01.ex05.domain.Users

class UsersRemoteDataSource {
    fun getUsers(): List<Users> {
        return emptyList()
    }

}



        fun getUsers():List<Users>{
            return mutableListOf(
                Users(1,"User1","Username1"),
                Users(2,"User2","Username2"),
                Users(3,"User3","Username3"),
                Users(4,"User4","Username4"),
                Users(5,"User5","Username5"),
                Users(6,"User6","Username6"),
                Users(7,"User7","Username7")
            )
        }