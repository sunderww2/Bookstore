package com.sunder.book.bookstore.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sunder.book.bookstore.entity.Book;

@Repository
public interface BookRepository extends CrudRepository{
	

}
