package com.moaimar.add.ut01.ex02.data

import android.app.Activity
import android.content.Context
import com.moaimar.add.R
import com.moaimar.add.ut01.ex02.domain.OpenedFirst
import com.moaimar.add.ut01.ex02.presentation.Ut01Ex02Activity


class SharedPreferenceLocalSource(private val activity: Activity) {

    private val localData = activity.getSharedPreferences(activity.getString(R.string.preference_ut01ex02), Context.MODE_PRIVATE)


    fun saveFirstOp() {
        val editor = localData.edit()

        editor.putBoolean("First Open", false)
        editor.apply()
    }

    fun getFirstOp(): OpenedFirst {
        return OpenedFirst(localData.getBoolean("First Open",true))
    }


}