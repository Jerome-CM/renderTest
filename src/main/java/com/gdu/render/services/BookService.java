package com.gdu.render.services;

import com.gdu.render.entities.Book;
import com.gdu.render.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getList(){
        return bookRepository.findAll();
    }

    public void saveList(){

        bookRepository.save(new Book("Book A", 10));
        bookRepository.save(new Book("Book B", 20));
    }
}
