package vn.dl.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ENTITY")
public class UserEntity {
	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "USER_SEQ", sequenceName = "USER_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "USER_SEQ")
	private Long id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "ADDRESS")
	private String address;
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(Long id, String username, String address) {
		super();
		this.id = id;
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
