package com.moaimar.add.ut01.ex03.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.moaimar.add.R
import com.moaimar.add.ut01.ex03.data.NewsLocalSource
import com.moaimar.add.ut01.ex03.domain.News
import com.moaimar.add.ut01.ex04.data.SecureSharedPreferences

class Ut01Ex03Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01_ex03)
        init()
        secure()
    }

    private fun initWithList(){
        val newsList: MutableList<News> = mutableListOf<News>(
        News(1,"Titular1","Subtitle1","Summary1"),
        News(2,"Titular2","Subtitle2","Summary2"),
        News(3,"Titular3","Subtitle3","Summary3"))

        val newsLocalSource = NewsLocalSource(
            getPreferences(MODE_PRIVATE)
        )
        newsLocalSource.setNewsList(newsList)

    }



    private fun init(){
        val newsLocalSource = NewsLocalSource(
            getPreferences(MODE_PRIVATE)
        )

        val news1 = News(1,"Titular1","Subtitle1","Summary1")
        val news2 = News(2,"Titular2","Subtitle1","Summary1")
        val news3 = News(3,"Titular3","Subtitle1","Summary1")
        newsLocalSource.saveNews(news1)
        newsLocalSource.saveNews(news2)
        newsLocalSource.saveNews(news3)

        val newNews = newsLocalSource.findById(2)

        Log.d("@dev","$newNews")
    }

    private fun secure(){
        val secure = SecureSharedPreferences(applicationContext)
        secure.saveNews(News(1,"News1","News1.2","NewsSummary"))
    }

}