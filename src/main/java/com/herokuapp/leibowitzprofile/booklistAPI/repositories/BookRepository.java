package com.herokuapp.leibowitzprofile.booklistAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.herokuapp.leibowitzprofile.booklistAPI.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}