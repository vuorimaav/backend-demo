package com.vvv.vvdemo.repo

import com.vvv.vvdemo.models.tables.Book.Companion.BOOK
import org.jooq.DSLContext
import org.jooq.Record2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
class BookRepository {

    @Autowired
    lateinit var dsl: DSLContext

    fun getBookByIsbn(isbn: String): Optional<Record2<String?, String?>> {
        return dsl.select(BOOK.NAME, BOOK.AUTHOR).from(BOOK).where(BOOK.ISBN.eq(isbn)).fetchOptional()

    }

}
