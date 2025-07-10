package com.aurionpro.models;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<BookApplication>{

	@Override
	public int compare(BookApplication b1, BookApplication b2) {
		
		return b1.getAuthor().compareTo(b2.getAuthor());

	}

}




