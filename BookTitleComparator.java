package com.aurionpro.models;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<BookApplication>{

	@Override
	public int compare(BookApplication a1, BookApplication a2) {
		
		return a1.getTitle().compareTo(a2.getTitle());

	}

}




