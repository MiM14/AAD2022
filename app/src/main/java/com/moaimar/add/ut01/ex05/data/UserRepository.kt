package com.moaimar.add.ut01.ex05.data

import com.moaimar.add.ut01.ex05.data.local.UsersLocalDataSource
import com.moaimar.add.ut01.ex05.data.remote.UsersRemoteDataSource
import com.moaimar.add.ut01.ex05.domain.Users

class UserRepository(
    val localSource: UsersLocalDataSource,
    val remoteSource : UsersRemoteDataSource
) {

    /*
    * First from Local and then from remote
    */
    fun getUsers(): List<Users>{


        var users = localSource.getUsers()
        if (users == null){
            users = remoteSource.getUsers()
            localSource.saveUsers(users)
        }
        return users

    }

}