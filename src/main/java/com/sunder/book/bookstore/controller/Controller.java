package com.sunder.book.bookstore.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunder.book.bookstore.entity.Book;
import com.sunder.book.bookstore.service.BookService;

@RestController
public class Controller {
	
	@Autowired
	private BookService bookservice;
	
	@RequestMapping(method=RequestMethod.GET,path="/getbooks")
	public List<Book> generateDetails(){
	return	bookservice.getListOfBooks();
		
	}
	
	@GetMapping("/helloWorld")
	public String sayHello()
	{
		return "Hello";
	}

}
