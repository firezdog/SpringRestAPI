package com.herokuapp.leibowitzprofile.booklistAPI.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herokuapp.leibowitzprofile.booklistAPI.entities.Book;
import com.herokuapp.leibowitzprofile.booklistAPI.repositories.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookRepository br;
	@PostMapping
	public Book createBook(@RequestBody Book newBook) {
		return br.save(newBook);
	}
	
	@GetMapping()
	public List<Book> getAllBooks(){
		return br.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Book getBook(@PathVariable long id) {
		return br.findById(id).orElse(new Book());
	}
	
	@PutMapping(value = "/{id}")
	public Book editBook(@RequestBody Book changedBook, @PathVariable long id) {
		Book oldBook = br.findById(id).get();
		oldBook.setAuthor(changedBook.getAuthor());
		oldBook.setGenre(changedBook.getGenre());
		oldBook.setPages(changedBook.getPages());
		oldBook.setTitle(changedBook.getTitle());
		oldBook.setYear(changedBook.getYear());
		return br.save(oldBook);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteBook(@PathVariable long id) {
		br.deleteById(id);
	}
	
	
}