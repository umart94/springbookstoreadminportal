package com.umartariq.service;

import java.util.List;

import com.umartariq.domain.security.Book;

public interface BookService {
	
	Book save(Book book);
	List<Book> findAll();
	Book findOne(Long id);
	void removeOne(Long id);
	

}
