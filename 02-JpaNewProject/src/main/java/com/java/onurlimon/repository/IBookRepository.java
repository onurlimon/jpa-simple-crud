package com.java.onurlimon.repository;

import com.java.onurlimon.model.Book;

public interface IBookRepository {
	
	void save(Book book);
	void delete(Book book);
	Book find(int id);
	Book update(Book book);

}
