package com.raphael.bookstoremanager.controller;

import com.raphael.bookstoremanager.dto.BookDTO;
import com.raphael.bookstoremanager.dto.MessageResponseDTO;
import com.raphael.bookstoremanager.entity.Book;
import com.raphael.bookstoremanager.exception.BookNotFoundException;
import com.raphael.bookstoremanager.repository.Bookrepository;
import com.raphael.bookstoremanager.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) throws BookNotFoundException {
        return bookService.findById(id);
    }



}
