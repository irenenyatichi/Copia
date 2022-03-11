package com.example.copia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Transaction
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun payments(MG001: Int, MG002: Int, MG003: Int, MG004: Int): Collection<Any> {
            return payments(100,200,300,250)}

        fun receiptsTable(R001: Int, R002: Int, R003: Int): Collection<Any> {
            return receiptsTable(100,200,450)}


        val transactions = listOf(payments(100,200,300,250))
        val receipts = listOf(receiptsTable(100,200,450))
        val joinedList = LinkedList<Any>()

        joinedList.addAll(payments (100,200,300,250));
        joinedList.addAll(receiptsTable(100,200,450))
        print(joinedList)

        fun bothLists () :Int{
            val combinedList = listOf<Int>()
            var zero = 0
            val receiptBalance = 0
            val transactionBalance = 0
            for(i in payments(100,200,300,250)){
                for(j in receiptsTable(100,200,450)) {
                    println("$i,$j")

        fun difference (){
            var balance = (receipts[0] + receiptBalance)-(transactions[0]+transactionBalance)
                if(balance .equals(0) ){
                    println(receipts)
                }
                else if(balance > zero){
                    transactions[0]
                    balance
                }
                else (balance < zero){
                    receipts [0]
                    balance
                }
            return difference()
            }
                    }

        }
            return bothLists()
    }}}

private operator fun Boolean.invoke(value: Any) {

}

private operator fun <E> List<E>.compareTo(zero: E) :Int{
    return 0
}