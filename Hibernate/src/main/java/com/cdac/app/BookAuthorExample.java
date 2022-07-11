package com.cdac.app;

import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorExample {

	public static void main(String[] args) {
		
		GenericDao dao = new GenericDao();
		
		/*Book book = new Book();
		book.setName("ABCD");
		book.setCost(200);
		
		dao.save(book);
		*/
		
		/*Author author = new Author();
		author.setName("Pqr");
		author.setEmail("pqr@gmail.com");
		dao.save(author);
		*/
		
		Book book =(Book) dao.fetchById(Book.class, 1);
		List<Author> authors = new ArrayList<Author>();
		authors.add((Author) dao.fetchById(Author.class, 1));
		authors.add((Author) dao.fetchById(Author.class, 2));
		
		book.setAuthors(authors);
		dao.save(book);
		
		
		
	}
}
