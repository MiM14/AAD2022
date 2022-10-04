package com.moaimar.add.ut01.ex03.data

import android.content.SharedPreferences
import com.google.gson.Gson
import com.moaimar.add.ut01.ex03.domain.News

class NewsLocalSource(val sharedPref:SharedPreferences) {
    fun setNews(news:News){

        val gson = Gson()
        val jsonNews = gson.toJson(news,News::class.java)

        val edit = sharedPref.edit()
        edit.putString(news.id.toString(),jsonNews)
        edit.apply()
    }
    fun findById(newsId:Int): News {
        val gson = Gson()
        val jsonNews = sharedPref.getString(newsId.toString(),"")

        return gson.fromJson(jsonNews, News::class.java)
    }

    fun setNewsList(newList: MutableList<News>){
        newList.forEach{
            setNews(it)
        }



    }

    fun findALl():MutableList<News>{
        //buscar y devolver todas las noticias
        val gson = Gson()
        val newsList = mutableListOf<News>()
        sharedPref.all.forEach{
            val news = gson.fromJson(it.value as String,News::class.java)
            newsList.add(news)
        }

        return newsList
    }

    fun findAllByKt(): MutableList<News>{
        val gson = Gson()
        return sharedPref.all.map{ entry ->
            gson.fromJson(entry.value as String, News::class.java)
        }.toMutableList()

    }
}