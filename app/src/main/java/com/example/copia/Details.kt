package com.example.copia

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Transactions(
    @PrimaryKey
    val transactionRef: Char,
    val amountPaid: Int
)

@Entity
data class ReceiptsTable(
    @PrimaryKey
    val receipts: Char,
    val amountToBePaid: Int
)

@Entity(primaryKeys = ["amountToBePaid", "amountPaid"])
class ReceiptTransactions(
    val amountToBePaid : Int,
    val amountPaid : Int
)