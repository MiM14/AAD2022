package com.moaimar.add.ut01.ex02.presentation
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.moaimar.add.R
import com.moaimar.add.ut01.ex02.data.SharedPreferenceLocalSource
import com.moaimar.add.ut01.ex02.domain.appFirstOpFun


class Ut01Ex02Activity :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex02)

        initFirstOpen()
    }

    private fun initFirstOpen(){
        val localSource = SharedPreferenceLocalSource(this)
        val app = localSource.getFirstOp()

        if (app.firstOp){
            Log.d("@dev", "Es la primera vez que se abre")
        } else {
            Log.d("@dev", "No es la primera vez que se abre")

        }
        localSource.saveFirstOp()
    }


}