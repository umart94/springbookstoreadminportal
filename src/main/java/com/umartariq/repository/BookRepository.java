package com.umartariq.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.umartariq.domain.security.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	
	
	

}
