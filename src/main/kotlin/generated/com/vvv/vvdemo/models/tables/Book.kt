/*
 * This file is generated by jOOQ.
 */
package com.vvv.vvdemo.models.tables


import com.vvv.vvdemo.models.Public
import com.vvv.vvdemo.models.keys.BOOK_PKEY
import com.vvv.vvdemo.models.tables.records.BookRecord

import java.time.OffsetDateTime
import java.util.function.Function

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row6
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Book(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, BookRecord>?,
    aliased: Table<BookRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<BookRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.book</code>
         */
        val BOOK: Book = Book()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BookRecord> = BookRecord::class.java

    /**
     * The column <code>public.book.isbn</code>.
     */
    val ISBN: TableField<BookRecord, String?> = createField(DSL.name("isbn"), SQLDataType.VARCHAR(17).nullable(false), this, "")

    /**
     * The column <code>public.book.name</code>.
     */
    val NAME: TableField<BookRecord, String?> = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>public.book.author</code>.
     */
    val AUTHOR: TableField<BookRecord, String?> = createField(DSL.name("author"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.book.published</code>.
     */
    val PUBLISHED: TableField<BookRecord, OffsetDateTime?> = createField(DSL.name("published"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>public.book.created</code>.
     */
    val CREATED: TableField<BookRecord, OffsetDateTime?> = createField(DSL.name("created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.book.updated</code>.
     */
    val UPDATED: TableField<BookRecord, OffsetDateTime?> = createField(DSL.name("updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    private constructor(alias: Name, aliased: Table<BookRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<BookRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.book</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.book</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.book</code> table reference
     */
    constructor(): this(DSL.name("book"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, BookRecord>): this(Internal.createPathAlias(child, key), child, key, BOOK, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<BookRecord> = BOOK_PKEY
    override fun `as`(alias: String): Book = Book(DSL.name(alias), this)
    override fun `as`(alias: Name): Book = Book(alias, this)
    override fun `as`(alias: Table<*>): Book = Book(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Book = Book(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Book = Book(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Book = Book(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?> = super.fieldsRow() as Row6<String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (String?, String?, String?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
