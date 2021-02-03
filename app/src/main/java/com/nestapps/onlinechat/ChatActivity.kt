package com.nestapps.onlinechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.solver.state.State
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
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
        if (message_textbox.text.isEmpty()) return

        // создаю объект, который описывает отправляемое сообщение
        var textbox = LayoutInflater.from(this).inflate(R.layout.own_mesage_box,
            messages_layout, false) as ConstraintLayout

        textbox.rotation = 180F // переворачиваю т.к. все повернуто
        val message = textbox.getViewById(R.id.message_textView) as TextView // получаю view сообщения
        message.text = message_textbox.text
        message_textbox.text = null
        messages_layout.addView(textbox, 0)
    }

    private fun showOpponentMessage(message: String){
        var textbox = LayoutInflater.from(this).inflate(R.layout.opponent_message_box,
            messages_layout, false) as ConstraintLayout

        textbox.rotation = 180F // переворачиваю т.к. все повернуто
        val messageView = textbox.getViewById(R.id.message_textView) as TextView // получаю view сообщения
        messageView.text = message
        message_textbox.text = null
        messages_layout.addView(textbox, 0)
    }

}