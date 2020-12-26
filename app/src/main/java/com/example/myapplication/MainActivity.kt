package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    fun onClickPsw(view: View) {
        val nameText: EditText = findViewById(R.id.editTextTextPersonName)
        nameText.setText("Angela Merkel?!")
    }

    fun onClickGetNews(view: View) {
        val newsList: LinearLayout = findViewById(R.id.news_table)
        newsList.addView(createNews("Notizia bomba, funziono!"))
    }

    private fun createNews(txt: String): LinearLayout {
        val myNews: LinearLayout = LinearLayout(this)
        myNews.orientation = LinearLayout.HORIZONTAL
        myNews.addView(this.createNewsText(txt))
        return myNews
    }

    /**
     * Creates the news text to be showed
     */
    private fun createNewsText(txt: String): TextView {
        val newText: TextView = TextView(this)
        newText.text = txt
        return newText
    }
}