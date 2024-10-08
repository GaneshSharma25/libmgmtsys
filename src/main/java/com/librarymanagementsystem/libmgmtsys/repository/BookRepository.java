package com.librarymanagementsystem.libmgmtsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagementsystem.libmgmtsys.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}
