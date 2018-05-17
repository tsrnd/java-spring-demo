package vn.dl.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import vn.dl.domain.BaseDomain;
import vn.dl.domain.Book;
import vn.dl.util.StringUtils;

@SuppressWarnings("serial")
@Entity
@Table(name = "BOOK_ENTITY")
public class BookEntity extends BaseEntity {
	
	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "BOOK_SEQ", sequenceName = "BOOK_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "BOOK_SEQ")
	private Long id;

	@Column(name = "USER_ID")
	private Long userID;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "NAME")
	private String name;

	public BookEntity() {
		super();
	}
	
	public BookEntity(Long id, Long userID, String author, String name) {
		super();
		this.id = id;
		this.userID = userID;
		this.author = author;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected BaseDomain toDomain() {
		return new Book(StringUtils.convertObjectToString(id), StringUtils.convertObjectToString(userID), StringUtils.convertObjectToString(author), StringUtils.convertObjectToString(name));
	}
	
}
