/*
 * This file is generated by jOOQ.
 */
package com.vvv.vvdemo.models.tables.records


import com.vvv.vvdemo.models.tables.Book

import java.time.OffsetDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class BookRecord() : UpdatableRecordImpl<BookRecord>(Book.BOOK), Record6<String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?> {

    open var isbn: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var author: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var published: OffsetDateTime?
        set(value): Unit = set(3, value)
        get(): OffsetDateTime? = get(3) as OffsetDateTime?

    open var created: OffsetDateTime?
        set(value): Unit = set(4, value)
        get(): OffsetDateTime? = get(4) as OffsetDateTime?

    open var updated: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row6<String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?> = super.fieldsRow() as Row6<String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?>
    override fun valuesRow(): Row6<String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?> = super.valuesRow() as Row6<String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?>
    override fun field1(): Field<String?> = Book.BOOK.ISBN
    override fun field2(): Field<String?> = Book.BOOK.NAME
    override fun field3(): Field<String?> = Book.BOOK.AUTHOR
    override fun field4(): Field<OffsetDateTime?> = Book.BOOK.PUBLISHED
    override fun field5(): Field<OffsetDateTime?> = Book.BOOK.CREATED
    override fun field6(): Field<OffsetDateTime?> = Book.BOOK.UPDATED
    override fun component1(): String? = isbn
    override fun component2(): String? = name
    override fun component3(): String? = author
    override fun component4(): OffsetDateTime? = published
    override fun component5(): OffsetDateTime? = created
    override fun component6(): OffsetDateTime? = updated
    override fun value1(): String? = isbn
    override fun value2(): String? = name
    override fun value3(): String? = author
    override fun value4(): OffsetDateTime? = published
    override fun value5(): OffsetDateTime? = created
    override fun value6(): OffsetDateTime? = updated

    override fun value1(value: String?): BookRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): BookRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): BookRecord {
        set(2, value)
        return this
    }

    override fun value4(value: OffsetDateTime?): BookRecord {
        set(3, value)
        return this
    }

    override fun value5(value: OffsetDateTime?): BookRecord {
        set(4, value)
        return this
    }

    override fun value6(value: OffsetDateTime?): BookRecord {
        set(5, value)
        return this
    }

    override fun values(value1: String?, value2: String?, value3: String?, value4: OffsetDateTime?, value5: OffsetDateTime?, value6: OffsetDateTime?): BookRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        return this
    }

    /**
     * Create a detached, initialised BookRecord
     */
    constructor(isbn: String? = null, name: String? = null, author: String? = null, published: OffsetDateTime? = null, created: OffsetDateTime? = null, updated: OffsetDateTime? = null): this() {
        this.isbn = isbn
        this.name = name
        this.author = author
        this.published = published
        this.created = created
        this.updated = updated
        resetChangedOnNotNull()
    }
}