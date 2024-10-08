package com.librarymanagementsystem.libmgmtsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagementsystem.libmgmtsys.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long>{

}
