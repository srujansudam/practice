package com.cg.lib.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cg.lib.exception.LibException;
import com.cg.lib.model.Book;

public class BookDAOImpl implements BookDAO {
	private Map<Integer, Book> booksMap;

	public BookDAOImpl() {
		booksMap = new TreeMap<>();
	}

	public void addBook(Book book) throws LibException {
		// TODO Auto-generated method stub
		if (book != null && !booksMap.containsKey(book.getBookCode())) {
			booksMap.put(book.getBookCode(), book);
		} else
			throw new LibException("No Book or Duplicate book recieved");

	}

	@Override
	public void upateBook(Book book) throws LibException {
		// TODO Auto-generated method stub
		if (book != null && booksMap.containsKey(book.getBookCode())) {
			booksMap.replace(book.getBookCode(), book);
		} else
			throw new LibException("No Book available in the Library");
	}

	@Override
	public void deleteBook(int bookCode) throws LibException {
		// TODO Auto-generated method stub
		if ( booksMap.containsKey(bookCode)) {
			booksMap.remove(bookCode);
		} else
			throw new LibException("No Book available in the Library");

	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub

		return new ArrayList<>(booksMap.values());
	}

	@Override
	public Book getBookById(int bookCode) {
		// TODO Auto-generated method stub
		return booksMap.get(bookCode);
	}

}
