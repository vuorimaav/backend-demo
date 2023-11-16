package com.vvv.vvdemo.service

import com.vvv.vvdemo.repo.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService {

    @Autowired
    lateinit var bookRepository: BookRepository

    fun getBookByIsbn(isbn: String): Optional<BookDto> {
        val result = bookRepository.getBookByIsbn(isbn);
        if (result.isPresent) {
            val book = result.get()
            return Optional.of(BookDto(book.value1().orEmpty(), book.value2().orEmpty(), isbn))
        }
        return Optional.empty()
    }

    class BookDto(val name: String, val author: String, val isbn: String)
}
