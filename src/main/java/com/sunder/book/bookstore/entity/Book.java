package com.sunder.book.bookstore.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class Book {
	private Integer id;
	private String desc;
	private String yop;
	private String bookType;
	
	public Book(int id, String desc, String yop, String bookType) {
		super();
		this.id = id;
		this.desc = desc;
		this.yop = yop;
		this.bookType = bookType;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	

}
