package com.example.copia

import androidx.room.*

@Dao
interface PaymentDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
//Avoids inserting an Assigned Tranaction Ref which already exists with the same receipt.
    fun main(join: ReceiptTransactions)

    @Transaction
    @Query("SELECT receipts , amountToBePaid FROM ReceiptsTable")
    fun getMatched (): List<PairedReceiptsTransaction>
}