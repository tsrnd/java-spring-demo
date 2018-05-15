package com.thinhung.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinhung.restful.model.Invoice;
import com.thinhung.restful.repository.InvoiceRepository;

@RestController
@RequestMapping(path = "/invoices")
public class InvoiceController {
	@Autowired
	 private InvoiceRepository invoiceRepository;
	
	@GetMapping(path = "/summary/{id}")
	public  @ResponseBody List<Invoice> summary(@PathVariable(name= "id") Long id) {
		return invoiceRepository.summary(id);
	}
}
