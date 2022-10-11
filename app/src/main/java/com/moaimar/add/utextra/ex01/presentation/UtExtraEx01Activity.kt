package com.moaimar.add.utextra.ex01.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.moaimar.add.R
import com.moaimar.add.utextra.ex01.data.local.OpenedFifthLocalDataSource
import com.moaimar.add.utextra.ex01.domain.OpenedFifth

class UtExtraEx01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut_extra_ex01)
        init()
    }
    fun init(){
        val openedFifth = OpenedFifthLocalDataSource(this)
        val count = openedFifth.getCount()
        openedFifth.saveCount(count)

        if(count == 5){
            Log.d("@dev","${openedFifth.getCount()}!! es la quinta vez")
        }else{
            Log.d("@dev", "${openedFifth.getCount()}")
        }
    }
}