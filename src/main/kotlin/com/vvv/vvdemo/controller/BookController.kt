package com.vvv.vvdemo.controller

import com.vvv.vvdemo.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class BookController {

    @Autowired
    lateinit var bookService: BookService

    @GetMapping("/get-book/{isbn}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getBook(@PathVariable isbn: String?): ResponseEntity<BookService.BookDto> {
        if (isbn.isNullOrEmpty()) return ResponseEntity(HttpStatus.BAD_REQUEST)
        val result = bookService.getBookByIsbn(isbn)
        if (result.isPresent)
            return ResponseEntity(result.get(), HttpStatus.OK)
        else return ResponseEntity(HttpStatus.NOT_FOUND)
    }

}
