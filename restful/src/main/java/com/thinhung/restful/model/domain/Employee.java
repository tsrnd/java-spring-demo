package com.thinhung.restful.model.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "genre")
    private String genre;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "address")
    private String address;
    @JsonProperty(value =  "phone")
    private String phone;
    @JsonProperty(value = "birthday")
    private Date birthday;

    public Employee() {
        super();
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

    public Employee(Long id, String genre, String name, String address, String phone, Date birthday) {
        super();
        this.id = id;
        this.genre = genre;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
    }
    
    public Employee(Long id, String name) {
    	super();
    	this.id = id;
    	this.name = name;
    }
}
