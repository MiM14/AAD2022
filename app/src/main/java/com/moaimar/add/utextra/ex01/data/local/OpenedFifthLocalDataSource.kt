package com.moaimar.add.utextra.ex01.data.local

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.moaimar.add.R
import com.moaimar.add.utextra.ex01.domain.OpenedFifth

class OpenedFifthLocalDataSource(val activity: Activity) {
    private val localData = activity.getSharedPreferences(activity.getString(R.string.preference_utextraex01), Context.MODE_PRIVATE)
    private val editor = localData.edit()


    fun saveCount(count: Int) {
        val result = count+1
        editor.putInt("Contador", result)
        editor.apply()
    }
    fun getCount(): Int {
        return OpenedFifth(localData.getInt("Contador",0)).count
    }
}
