package com.example.copia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun payments(MG001: Int, MG002: Int, MG003: Int, MG004: Int):String {
            val transactionRef = mutableListOf(100, 200, 300, 250)


        fun receiptsTable(R001: Int, R002: Int, R003: Int):Int {
            val amountsToBePaid = receiptsTable(100,400,350)

            val result = when (amountsToBePaid) {
                100 -> MG001
                200 -> MG002
                300 -> MG003
                250 -> MG004

                else -> { val difference = amountsToBePaid-transactionRef
                when (difference){
                    100 -> MG001
                    200 -> MG002
                    300 -> MG003
                    250 -> MG004

                    else -> "Not Found"
                }
                    }                    }
            println(result)
            return receiptsTable(100,400,350)
        }
            return payments(100, 200, 300, 250)
        }
    }
}

private operator fun Int.minus(transactionRef: MutableList<Int>):Int {
    return Int.MAX_VALUE
}
