package com.gdu.render.controllers;

import com.gdu.render.entities.Book;
import com.gdu.render.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/")
    public List<Book> getHome(){
        return bookService.getList();
    }

    @GetMapping("/saveList")
    public void saveList(){
        bookService.saveList();
    }

}
