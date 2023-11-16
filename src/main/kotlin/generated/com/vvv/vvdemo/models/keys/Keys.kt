/*
 * This file is generated by jOOQ.
 */
package com.vvv.vvdemo.models.keys


import com.vvv.vvdemo.models.tables.Book
import com.vvv.vvdemo.models.tables.FlywaySchemaHistory
import com.vvv.vvdemo.models.tables.records.BookRecord
import com.vvv.vvdemo.models.tables.records.FlywaySchemaHistoryRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val BOOK_PKEY: UniqueKey<BookRecord> = Internal.createUniqueKey(Book.BOOK, DSL.name("book_pkey"), arrayOf(Book.BOOK.ISBN), true)
val FLYWAY_SCHEMA_HISTORY_PK: UniqueKey<FlywaySchemaHistoryRecord> = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), arrayOf(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK), true)