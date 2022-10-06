package com.moaimar.add.ut01.ex05.data.local

import com.moaimar.add.ut01.ex05.domain.Users

class UsersLocalDataSource {

    fun saveUsers(users: List<Users>){

    }

    fun getUsers(): List<Users>? {
        return emptyList()

    }

    fun findById(userId:Int) /*:Users*/ {
        //TODO: verificar en local sino en remoto
    }

    fun remove(userId:Int){
        //TODO (local)
    }
}
