package com.thinhung.restful.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.thinhung.restful.model.domain.Employee;
import com.thinhung.restful.model.domain.Invoice;

@Entity
@Table(name = "Employees")
@SqlResultSetMappings({
	@SqlResultSetMapping( 
			name = "Summary",
			classes = {
					@ConstructorResult(
							targetClass = Employee.class,
							columns = {
									@ColumnResult(name = "id", type = Long.class),
									@ColumnResult(name = "name", type = String.class)
							}
							),
					@ConstructorResult(
							targetClass = Invoice.class,
							columns = {
									@ColumnResult(name = "id", type = Long.class),
									@ColumnResult(name = "sell_date", type = Date.class)
							}
							)
			}
			)
})
public class EmployeeEntity implements BaseEntityInterface<Employee> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "genre")
	private String genre;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "phone")
	private String phone;
	@Column(name = "birthday")
	private Date birthday;

	public EmployeeEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public EmployeeEntity(Long id, String genre, String name, String address, String phone, Date birthday) {
		super();
		this.id = id;
		this.genre = genre;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.birthday = birthday;
	}

	public Employee toDomain() {
		return new Employee(id, genre, name, address, phone, birthday);
	}
}
