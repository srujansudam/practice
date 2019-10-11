package com.cg.lib.model;

public class Book {
	private Integer bookCode;
	private String title;
	private double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookCode, String title, double price) {
		super();
		this.bookCode = bookCode;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", title=" + title + ", price=" + price + "]";
	}

	public Integer getBookCode() {
		return bookCode;
	}

	public void setBookCode(Integer bookCode) {
		this.bookCode = bookCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
