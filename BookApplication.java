package com.aurionpro.models;

public class BookApplication implements Comparable<BookApplication> {

	private int bookID;
	private String author;
	private String title;
	private boolean isIssued;
//	private boolean isReturned;

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}

//	public void setReturned(boolean isReturned) {
//		this.isRetur = isIssued;
//	}

	@Override
	public String toString() {
		return "BookApplication [bookID=" + bookID + ", author=" + author + ", title=" + title + ", isIssued="
				+ isIssued + "]";
	}

	public BookApplication(int bookID, String author, String title, boolean isIssued) {
		super();
		this.bookID = bookID;
		this.author = author;
		this.title = title;
		this.isIssued = isIssued;

	}

	public BookApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void issueBook() {
		isIssued = true;
		System.out.println("Book is successfully issued!");
	}

	public void returnBook() {
		isIssued = false;
		System.out.println("Book successfully returned back!");
	}

	@Override
	public int compareTo(BookApplication o) {
		return this.author.compareToIgnoreCase(o.getAuthor());
	}
	
	
	public int compareTo1(BookApplication k) {
		return this.title.compareToIgnoreCase(k.getTitle());
	}

}
