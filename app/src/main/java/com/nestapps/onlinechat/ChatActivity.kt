package com.nestapps.onlinechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.chat_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.end_the_dialog_menu_item -> {
                finish()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun finish() {
        Toast.makeText(this, "Closed", Toast.LENGTH_SHORT)
        Log.i("kek", "asd")

        super.finish()
    }

    fun onSendButtonClicked(v: View){
        var textbox = LayoutInflater.from(this).inflate(R.layout.mesage_box, null) as RelativeLayout



    }

}