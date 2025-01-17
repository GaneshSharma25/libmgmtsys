package com.librarymanagementsystem.libmgmtsys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagementsystem.libmgmtsys.entity.Book;
import com.librarymanagementsystem.libmgmtsys.repository.BookRepository;

@Service
public class BookService{

    @Autowired
    private BookRepository bookRepository;



    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    

}
