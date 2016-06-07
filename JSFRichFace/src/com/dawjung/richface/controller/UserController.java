package com.dawjung.richface.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.dawjung.richface.dao.BookDao;
import com.dawjung.richface.model.Book;
import com.dawjung.richface.utils.DB;

@ManagedBean
@RequestScoped
public class UserController {

	@ManagedProperty(value="#{book}")
	private Book book;
	
	private List<Book> bookList;
	
//	@PostConstruct
//	public void init() {
//		bookList = processBooks();
//	}
	
	public List<Book> processBooks() {
		BookDao bookDao = new BookDao();
		bookDao.setConn(DB.getConnection());
		return bookDao.getBooks();
	}
	
	public void insertBook() {
		BookDao bookDao = new BookDao();
		bookDao.setConn(DB.getConnection());
		bookDao.insertBook(book);
	}

	// Getter & Setter
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
}
