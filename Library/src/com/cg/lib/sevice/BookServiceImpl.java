package com.cg.lib.sevice;

import java.util.List;

import com.cg.lib.dao.BookDAO;
import com.cg.lib.dao.BookDAOImpl;
import com.cg.lib.exception.LibException;
import com.cg.lib.model.Book;

public class BookServiceImpl implements BookServcie {

	private BookDAO bookDao;

	public BookServiceImpl() {
		bookDao = new BookDAOImpl();
	}

	public boolean isValidBook(Book book) {
		return true;
	}

	@Override
	public void addBook(Book book) throws LibException {
		// TODO Auto-generated method stub
		if (isValidBook(book)) {
			bookDao.addBook(book);
		} else
			throw new LibException("Not a Valid Book");
	}

	@Override
	public void upateBook(Book book) throws LibException {
		// TODO Auto-generated method stub
		if (isValidBook(book)) {
			bookDao.upateBook(book);
		} else
			throw new LibException("Not a Valid Book");
	}

	@Override
	public void deleteBook(int bookCode) throws LibException {
		// TODO Auto-generated method stub
		bookDao.deleteBook(bookCode);

	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookCode) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(bookCode);
	}

	@Override
	public List<Book> getAllBooksOrderedByBookCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksOrderedByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksOrderedByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
