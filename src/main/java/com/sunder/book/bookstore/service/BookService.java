package com.sunder.book.bookstore.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunder.book.bookstore.data.BookRepository;
import com.sunder.book.bookstore.entity.Book;

@Service
public class BookService {
	
//	@Autowired
//	private BookRepository bookrepository;
//	
	private Integer id;
	private String desc;
	private String yop;
	private String bookType;
	
	List <Book> l= Arrays.asList(new Book(1,"For Whom the Bell Tolls","2000","Fiction"),
								 new Book(2,"Two Years Eight Months and Twenty-Eight Nights","2001","Adventure"),
								 new Book(3,"The Score of My Life","2002","Biography"));
	
	public List<Book> getListOfBooks()
	{
//		Iterable<Book> iterable= bookrepository.findAll();
//		Iterator<Book> itr=iterable.iterator();
//		List<Book> l=new ArrayList<Book>();
//		while(itr.hasNext())
//		{
//			Object o=(Object) itr.next();
//			Book b=(Book)o;
//			l.add(b);
//		}
		return l;
	}

}
