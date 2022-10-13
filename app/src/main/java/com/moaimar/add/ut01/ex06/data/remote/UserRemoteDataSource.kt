package com.moaimar.add.ut01.ex06.data.remote


import com.moaimar.add.ut01.ex06.domain.Address
import com.moaimar.add.ut01.ex06.domain.Company
import com.moaimar.add.ut01.ex06.domain.Geo
import com.moaimar.add.ut01.ex06.domain.User

class UsersRemoteDataSource {

    fun getUsers():List<User>{
        return mutableListOf(
            User(1,"User1","Username1","email2", (Address("Calle 1","suite1","Ciudad1","Zipcode1", (Geo("Lat1","Ing1")))),"Number1","website1", (Company("name1","catchPhrase1","bs1"))),
            User(2,"User2","Username2","email2", (Address("Calle 1","suite1","Ciudad1","Zipcode1", (Geo("Lat2","Ing2")))),"Number2","website2", (Company("name2","catchPhrase2","bs2"))),
            User(3,"User2","Username2","email2", (Address("Calle 1","suite1","Ciudad1","Zipcode1", (Geo("Lat2","Ing2")))),"Number2","website2", (Company("name2","catchPhrase2","bs2"))),

        )


    }




}