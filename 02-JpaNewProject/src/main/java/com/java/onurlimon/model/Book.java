package com.java.onurlimon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Books")
public class Book {

	@Id
	@Column(name="bookId")
	private int bookId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="pageCount")
	private int pageCount;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="authorName")
	private String authorName;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="publisherDate")
	private Date publisherDate;

	public Book() {

	}

	public Book(int bookId, String name, int pageCount, String topic, String authorName, Date publisherDate) {
		
		this.bookId = bookId;
		this.name = name;
		this.pageCount = pageCount;
		this.topic = topic;
		this.authorName = authorName;
		this.publisherDate = publisherDate;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Date getPublisherDate() {
		return publisherDate;
	}

	public void setPublisherDate(Date publisherDate) {
		this.publisherDate = publisherDate;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", pageCount=" + pageCount + ", topic=" + topic
				+ ", authorName=" + authorName + ", publisherDate=" + publisherDate + "]";
	}

	
	
}
