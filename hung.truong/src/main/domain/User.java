package main.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
	@Column(name = "user_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	private String username;
	private String fulname;
	private String address;

	public User() {
		super();
	}

	public User(String username, String fulname, String address) {
		super();
		this.username = username;
		this.fulname = fulname;
		this.address = address;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFulname() {
		return fulname;
	}

	public void setFulname(String fulname) {
		this.fulname = fulname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
