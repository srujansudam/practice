package com.cg.lib.dao;

import java.util.List;

import com.cg.lib.exception.LibException;
import com.cg.lib.model.Book;

public interface BookDAO {
	void addBook(Book book) throws LibException; 
	void upateBook(Book book) throws LibException;
	void deleteBook(int bookcode) throws LibException;
	List<Book> getAllBooks();
	Book getBookById(int bookCode);
}
