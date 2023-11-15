package com.vvv.vvdemo.service

import org.springframework.stereotype.Service

@Service
class BookService {

    fun getBookByIsbn(isbn: String): BookDto {
        return BookDto("New book name", isbn)
    }

    class BookDto(val name: String, val isbn: String)
}
