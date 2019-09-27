package jb29.unit9.classes;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

	public static void main(String[] args) {

		BookList bookList = new BookList();

		bookList.add(
				new Book(1, "1984", "George Orwell", "Houghton Mifflin Harcourt", 2013, 237, 39.99, "Kindle Edition"));
		bookList.add(new Book(2, "1812: The War That Forged a Nation", "Walter R. Bornemanl", "Harper Perennial", 2005,
				392, 29.99, "Paperback"));
		bookList.add(
				new Book(3, "Schilderslief", "Simone van der Vlugt", "Ambo|Anthos", 2019, 315, 49.99, "Hardcover"));
		
		System.out.println(bookList);

		System.out.println(findBookByAuthor(bookList, "George Orwell"));
		System.out.println(findBookByPublishingHouse(bookList, "Harper Perennial"));
		System.out.println(findBookByYearAbove(bookList, 2018));
	}

	public static List<Book> findBookByAuthor(BookList custList, String author) {

		List<Book> bookList;
		List<Book> bookListResult = new ArrayList<Book>();

		Book book;

		bookList = custList.getBooks();

		for (int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);

			if (book.getAuthor() == author) {

				bookListResult.add(book);
			}
		}

		return bookListResult;

	}

	public static List<Book> findBookByPublishingHouse(BookList custList, String publishingHouse) {

		List<Book> bookList;
		List<Book> bookListResult = new ArrayList<Book>();

		Book book;

		bookList = custList.getBooks();

		for (int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);

			if (book.getPublishingHouse() == publishingHouse) {

				bookListResult.add(book);
			}
		}

		return bookListResult;

	}

	public static List<Book> findBookByYearAbove(BookList custList, int year) {

		List<Book> bookList;
		List<Book> bookListResult = new ArrayList<Book>();

		Book book;

		bookList = custList.getBooks();

		for (int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);

			if (book.getYear() >= year) {

				bookListResult.add(book);
			}
		}

		return bookListResult;

	}

}
