package com.assignment.demonativelibrary.chat

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.assignment.demonativelibrary.R

class ChatActivity : AppCompatActivity() {

    private val btnSend: ImageView by lazy {
        findViewById(R.id.btnSend)
    }
    private val edtMessage: EditText by lazy {
        findViewById(R.id.edtMessage)
    }

    private val txtMessage: TextView by lazy {
        findViewById(R.id.txtMessage)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        btnSend.setOnClickListener {
            edtMessage.text.toString()?.let {
                txtMessage.text = it
                edtMessage.setText("")
            }
        }

    }
}