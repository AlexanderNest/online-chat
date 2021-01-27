package com.nestapps.onlinechat.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nestapps.onlinechat.R

class SearchingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching)
    }

    fun onStopButtonClicked(v: View){
        finish()
    }
}