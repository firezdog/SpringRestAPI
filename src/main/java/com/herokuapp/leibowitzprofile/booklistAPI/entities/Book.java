package com.herokuapp.leibowitzprofile.booklistAPI.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Books")

public class Book {
	@Id
	@GenericGenerator(name="inc", strategy="increment")
	@GeneratedValue(generator="inc")
	@Column(name="Id")
	private long Id;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="pages")
	private int pages;
	@Column(name="genre")
	private String genre;
	@Column(name="year")
	private int year;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Book() {
		super();
	}
	
	public Book(String title, String author, int pages, String genre, int year) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.genre = genre;
		this.year = year;
	}
	
	
}