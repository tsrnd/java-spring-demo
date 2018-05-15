package vn.dl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String author;
	
	@ManyToOne
	private User user;

	public Book() {
		super();
	}

	public Book(long id, String name, String author, User user) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.user = user;
	}

	public Book(String name, String author, User user) {
		super();
		this.name = name;
		this.author = author;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
