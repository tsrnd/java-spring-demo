package com.thinhung.restful.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.thinhung.restful.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	
	@Query(value = "SELECT m.id FROM Invoice m WHERE m.id > :id" ) 
	public List<Invoice> summary(@Param("id") Long id); 
}
