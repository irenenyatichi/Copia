package com.example.copia

data class Properties(
    val transactionRef: Char,
    val amountPaid: Int,
    val receipts: Char,
    val amountToBePaid: Int,
    val ReceiptTransactions : Any,
    val ReceiptsTable: List<Any>,
    val Transactions: List<Any>
)
