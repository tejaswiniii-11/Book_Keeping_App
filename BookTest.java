package com.aurionpro.tests;

import com.aurionpro.models.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

import com.aurionpro.models.BookApplication;

public class BookTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<BookApplication> book1 = new ArrayList<>();
		List<BookApplication> book2 = new ArrayList<>();
		int bookID = 0;
		String author="NULL";
		String title="NULL";

		int choice;
//		int outerchoice;
//		do {
//		System.out.println("1. Display Main menu");
//		System.out.println("2. Exit");
//		System.out.println("Enter your choice: ");
//		outerchoice=scanner.nextInt();	
		
		do {
		System.out.println("------------------------------------------------");
		System.out.println("Book Application Menu Driven");
		System.out.println("------------------------------------------------");
		System.out.println("1. Add new book");
		System.out.println("2. Issue book");
		System.out.println("3. Display all available books");
		System.out.println("4. Display all issued books");
		System.out.println("5. Return book");
		System.out.println("6. Sort books by ascending order of author");
		System.out.println("7. Sort books by descending order of title");
		System.out.println("8. Exit");
		System.out.println("------------------------------------------------");
		System.out.println("Enter your choice: ");
		choice = scanner.nextInt();

		if (choice == 1) {
			System.out.println("------------------------------------------------------");
			System.out.println("Enter the book you want to add! ");
			System.out.println("Enter the book ID: ");
			bookID = scanner.nextInt();
			System.out.println("Enter the author: ");
			author = scanner.next();
			System.out.println("Enter the title: ");
			title = scanner.next();
			System.out.println("------------------------------------------------------");
			book1.add(new BookApplication(bookID,author,title,false));
			
			for(BookApplication book:book1) {
				System.out.println(book);
			}
		}

		if (choice == 2) {
			System.out.println("------------------------------------------------------");
			System.out.println("Enter the book you want to issue!");
			System.out.println("Enter the book ID:");
			int targetbookID = scanner.nextInt();
			for(BookApplication book:book1) {
				if(book.getBookID() == targetbookID && !book.isIssued()) {
					book.issueBook();
					book2.add(new BookApplication(bookID,author,title,true));
					break;
				}
				if(book.getBookID() == targetbookID && book.isIssued()) {
					System.out.println("Book already issued");
					break;
				}
				System.out.println("The book doesn't exist");
			}
		}

		if (choice == 3) {
			System.out.println("------------------------------------------------------");
			System.out.println("The available books are: ");
			for(BookApplication book:book1) {
				System.out.println(book);
			}
		}

		if (choice == 4) {
			System.out.println("------------------------------------------------------");
			System.out.println("The issued books are: ");
			for(BookApplication book:book2) {
				System.out.println(book);
			}

		}

		if (choice == 5) {
			System.out.println("------------------------------------------------------");
			System.out.println("You want to return book? sure! ");
			System.out.println("Enter the book ID of the book which you want to return: ");
			int returnID = scanner.nextInt();
			for(BookApplication book:book1) {
				if(book.getBookID() == returnID && book.isIssued()) {
					book.returnBook();
					book2.remove(new BookApplication(bookID,author,title,true));
					break;
				}
				if(book.getBookID() == returnID && !book.isIssued()) {
					System.out.println("Book has not been issued by you!");
					break;
				}
				System.out.println("The book doesn't exist");
			}
			
		}

		if (choice == 6) {
			System.out.println("------------------------------------------------------");
			System.out.println("Sorted the books by ascending order of author and as follows:  ");
			
			//method1 to sort
//			Collections.sort(book1);
//		    for(BookApplication book:book1) {
//		      System.out.println(book);
//		    }
		    
		    System.out.println("=============================================");
		    
		    Collections.sort(book1, new BookAuthorComparator());
		    for(BookApplication book:book1) {
		      System.out.println(book);
		    }

		}

		if (choice == 7) {
			System.out.println("------------------------------------------------------");
			System.out.println("Sorted the books by descending order of title and as follows:  ");
			
		    System.out.println("=============================================");
		    
		    Collections.sort(book1, new BookTitleComparator());
		    for(BookApplication book:book1) {
		      System.out.println(book);
		    }

		}
		if (choice == 8) {
			System.out.println("===========================================================");
			System.out.println("Exiting the Menu Driven Application...");
			System.out.println("===========================================================");
			return;
		}
		}while(choice!=0);
//		}while(outerchoice!=0);

	}

}
