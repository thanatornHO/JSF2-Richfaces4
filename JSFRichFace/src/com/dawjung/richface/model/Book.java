package com.dawjung.richface.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="book")
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1887016785171700224L;
	
	private String bookId;
	private String bookName;
	private String bookDesc;
	private String createDate;
	
	public Book() {
		super();
	}

	public Book(String bookId, String bookName, String bookDesc, String createDate) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDesc = bookDesc;
		this.createDate = createDate;
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
}
