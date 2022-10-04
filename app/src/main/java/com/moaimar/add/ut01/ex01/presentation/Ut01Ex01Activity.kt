package com.moaimar.add.ut01.ex01.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.moaimar.add.R
import com.moaimar.add.ut01.ex01.data.CustomerDataLocalSource
import com.moaimar.add.ut01.ex01.domain.Customer

class Ut01Ex01Activity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex01)

        initSharedPreference()
    }

    private fun initSharedPreference(){
        //val spCustomer: SharedPreferenceLocalSource = SharedPreferenceLocalSource(this)
        val spCustomer = CustomerDataLocalSource(this)
        spCustomer.saveCustomer(Customer(1,"customer1","Surname1",true))
    }
}