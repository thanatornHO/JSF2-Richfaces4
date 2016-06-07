package com.dawjung.richface.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dawjung.richface.model.Book;

public class BookDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BookDao.class);

	private Connection conn;
	
	public List<Book> getBooks() {
		List<Book> bookList = new ArrayList<Book>();
		String sql = "Select * from book";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookId(rs.getString("BOOK_ID"));
				book.setBookName(rs.getString("BOOK_NAME"));
				book.setBookDesc(rs.getString("BOOK_DESC"));
				book.setCreateDate(rs.getString("CREATE_DATE"));
				bookList.add(book);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
	public void insertBook(Book book) {
		String sql = "insert into book(book_name, book_desc) values (?, ?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, book.getBookName());
			ps.setString(2, book.getBookDesc());
			int result = ps.executeUpdate();
			
			if (result == 0) {
				LOGGER.error("fail insert data");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
}
