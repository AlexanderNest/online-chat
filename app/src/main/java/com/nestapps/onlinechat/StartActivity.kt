package com.nestapps.onlinechat.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nestapps.onlinechat.R

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_activty)
    }

    fun onStartSearchingButtonClicked(view: View){
        val intent = Intent(this, SearchingActivity::class.java)
        startActivity(intent)
    }


}