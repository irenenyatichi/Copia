package com.example.copia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun payments(MG001: Int, MG002: Int, MG003: Int, MG004: Int) {
            val transactionRef = payments(100, 200,300,250)
        }

        fun receiptsTable(R001: Int, R002: Int, R003: Int) {
            val amountsToBePaid = receiptsTable(100, 400, 350)
        }

    }
}