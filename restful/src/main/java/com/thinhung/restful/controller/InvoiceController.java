package com.thinhung.restful.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinhung.restful.common.Data;
import com.thinhung.restful.common.Meta;
import com.thinhung.restful.common.Response;
import com.thinhung.restful.model.domain.Invoice;
import com.thinhung.restful.repository.InvoiceRepository;

@RestController
@RequestMapping(path = "/invoices")
public class InvoiceController {
	@Autowired
	 InvoiceRepository invoiceRepository;
	
	@GetMapping(path = "/summary")
	@ResponseBody
	public Object summary(
			@Valid @RequestParam(name = "employee_id", required = true) Long employeeId,
			@Valid @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam(name = "from_date", required = true) Date fromDate,
			@Valid @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam(name = "to_date", required = true) Date toDate) throws Exception {
		Meta meta = new Meta(HttpStatus.OK, "");
		Data<Object> data = new Data<Object>();
		Object result = invoiceRepository.summary(employeeId, fromDate, toDate);
		data.setValue(result);
		Response<Object> response = new Response<>(meta, data); 
		return response;
	}
}
