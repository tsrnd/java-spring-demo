package vn.dl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String username;
	private String address;

	public User( ) {
		super();
	}

	public User(Long id, @NotNull String username, String address) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
	}

	public User(@NotNull String username, String address) {
		super();
		this.username = username;
		this.address = address;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
