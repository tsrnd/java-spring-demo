package com.example.wsdemo.wsdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.org.apache.regexp.internal.recompile;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "kanjis")
public class Kanji {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String hira;
	private String nghia;
	
	public Kanji() {}
	
	public Kanji(int id, String hira, String nghia) {
		this.id = id;
		this.hira = hira;
		this.nghia = nghia;
	}
	
	public int getId() {
		return id;
	}
	
	public String getHira() {
		return hira;
	}
	
	public String getNghia() {
		return nghia;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setHira(String hira) {
		this.hira = hira;
	}
	
	public void setNghia(String nghia) {
		this.nghia = nghia;
	}
}
