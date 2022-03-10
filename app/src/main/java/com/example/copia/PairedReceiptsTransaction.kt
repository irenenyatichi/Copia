package com.example.copia

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import kotlin.collections.List as List

data class PairedReceiptsTransaction(
    @Embedded
    var money: ReceiptsTable,
    @Relation(
        parentColumn = "amountToBePaid",
        entity = ReceiptsTable::class,
        entityColumn = "amountPaid",
        associateBy = Junction(
            value = ReceiptTransactions::class,
            parentColumn = "amountToBePaid",
            entityColumn = "amountPaid"
        )
    )
    var moneys: PairedReceiptsTransaction?
    )