package com.autowired.inyeccionDependencias.controller;

import com.autowired.inyeccionDependencias.model.Book;
import com.autowired.inyeccionDependencias.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository repository;

    @GetMapping("/books")
    public List<Book> traerTodos(){
        return repository.traerTodos();
    }

}
