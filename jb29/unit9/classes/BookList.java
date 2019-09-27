package jb29.unit9.classes;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	private List<Book> books;

	public BookList() {
		books = new ArrayList<Book>();
	}

	public void add(Book book) {

		books.add(book);
	}

	public void remove(Book book) {

		books.remove(book);
	}

	public List<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		return "BookList [books=" + books + "]";
	}

}
