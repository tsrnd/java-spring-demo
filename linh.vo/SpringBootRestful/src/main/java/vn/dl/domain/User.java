package vn.dl.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import vn.dl.domain.entity.UserEntity;
import vn.dl.util.StringUtils;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends BaseDomain {
	private String id;
	private String username;
	private String address;

	public User() {
		super();
	}

	public User(String id, String username, String address) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	public UserEntity toEntity() {
		try {
			UserEntity userEntity = new UserEntity(!StringUtils.isValidString(id) ? null : Long.valueOf(id), username, address);
			return userEntity;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
