package com.example.aulafragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            val gerenciaFragment = supportFragmentManager.beginTransaction()
            gerenciaFragment.replace(R.id.my_container,Fragment1.criaFragment())
            gerenciaFragment.commit()
        }

        button2.setOnClickListener {
            val gerenciaFragment = supportFragmentManager.beginTransaction()
            gerenciaFragment.replace(R.id.my_container,Fragment2.criaFragment())
            gerenciaFragment.commit()
        }

        button3.setOnClickListener {
            val gerenciaFragment = supportFragmentManager.beginTransaction()
            gerenciaFragment.replace(R.id.my_container,Fragment3.criaFragment())
            gerenciaFragment.commit()
        }

    }


}