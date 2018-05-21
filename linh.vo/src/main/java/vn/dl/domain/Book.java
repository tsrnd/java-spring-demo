package vn.dl.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import vn.dl.domain.entity.BookEntity;
import vn.dl.util.StringUtils;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book extends BaseDomain {
	@JsonProperty("book_id")
	private String id;
	@JsonProperty("user_id")
	private String userId;
	private String author;
	private String name;
	
	public Book() {
		super();
	}

	public Book(String id, String userId, String author, String name) {
		super();
		this.id = id;
		this.userId = userId;
		this.author = author;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
	
	public BookEntity toEntity() {
		try {
			BookEntity bookEntity = new BookEntity(!StringUtils.isValidString(id) ? null : Long.valueOf(id), !StringUtils.isValidString(userId) ? null : Long.valueOf(userId), author, name);
			return bookEntity;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
