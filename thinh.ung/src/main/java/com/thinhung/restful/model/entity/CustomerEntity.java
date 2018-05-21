package com.thinhung.restful.model.entity;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.thinhung.restful.model.domain.Customer;

@Entity
@Table(name = "Customers")
@SqlResultSetMappings( {
		@SqlResultSetMapping(
				name = "CustomerDetail",
				entities = {
						@EntityResult(entityClass = CustomerEntity.class)
				}
				),
		@SqlResultSetMapping(
				name = "CustomerDetail2",
				classes = {
						@ConstructorResult(
								targetClass = Customer.class,
								columns = {
										@ColumnResult(name = "id", type = Long.class),
										@ColumnResult(name = "address", type = String.class)
								}
								)
				}
				)

})
public class CustomerEntity implements BaseEntityInterface<Customer>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "phone")
	private String phone;
	@Column(name = "address")
	private String address;

	public CustomerEntity() {

	}

	public CustomerEntity(Long id, String name, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public Customer toDomain() {
		return new Customer(id, name, phone, address);
	}
}
