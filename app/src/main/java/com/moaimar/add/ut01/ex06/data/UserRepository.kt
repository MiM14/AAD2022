package com.moaimar.add.ut01.ex06.data

import com.moaimar.add.ut01.ex06.data.local.UsersLocalDataSource
import com.moaimar.add.ut01.ex06.data.remote.UsersRemoteDataSource
import com.moaimar.add.ut01.ex06.domain.User

class UserRepository(
    val localSource: UsersLocalDataSource,
    val remoteSource : UsersRemoteDataSource
) {

    /*
    * First from Local and then from remote
    */
    fun createUsers(): List<User>{


        var users = localSource.getUsers()
        if (users.isEmpty()){
            users = remoteSource.getUsers()
            localSource.saveUsers(users)
        }
        return users

    }
    fun findById(userId:Int): User?{
        return localSource.findById(userId)
    }

    fun deleteUser(userId:Int){
        localSource.remove(userId)
    }

    fun updateUser(){
        createUsers()
    }



}