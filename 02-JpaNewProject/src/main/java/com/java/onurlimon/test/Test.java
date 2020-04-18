package com.java.onurlimon.test;

import java.util.Calendar;
import java.util.Date;

import com.java.onurlimon.model.Book;
import com.java.onurlimon.repository.BookRepositoryImpl;
import com.java.onurlimon.repository.IBookRepository;

public class Test {

	public static void main(String[] args) {
		
		IBookRepository bookRepository = new BookRepositoryImpl();
		
		Book firstBook = new Book(1,"Game of Thrones", 155, "Fantezi Aksiyon", "Ned Stark", createCustomDate(1996,03,19));
		Book secondBook = new Book(2,"Sons of Anarchy", 155, "Everything", "Kurt Sutter", createCustomDate(1998,03,19));
		Book thirdBook = new Book(3,"Mr Robot", 155, "Science", "Onur L", createCustomDate(1994,03,19));
		
		/*bookRepository.save(firstBook);
		bookRepository.save(secondBook);
		bookRepository.save(thirdBook);*/
		
		/*Book myBook = bookRepository.find(1);
		
		myBook.setAuthorName("Jax Teller");
		
		bookRepository.update(myBook);*/
		
		Book willBeDeleteBook = bookRepository.find(3);
		
		bookRepository.delete(willBeDeleteBook);

	}
	
	
	public static Date createCustomDate(int day, int month, int year) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		
		return calendar.getTime();
		
	}

}
