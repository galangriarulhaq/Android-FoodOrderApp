package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class IntroActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var startBtn: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        startBtn = findViewById(R.id.startBtn)
        startBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.startBtn -> {
                val moveActivity = Intent(this@IntroActivity, MainActivity::class.java)
                startActivity(moveActivity)
            }
        }
    }
}