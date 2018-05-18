package com.thinhung.restful.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.thinhung.restful.model.domain.Customer;
import com.thinhung.restful.model.domain.Employee;
import com.thinhung.restful.model.domain.Invoice;
import com.thinhung.restful.model.entity.CustomerEntity;
import com.thinhung.restful.model.entity.EmployeeEntity;
import com.thinhung.restful.model.entity.InvoiceDetailEntity;
import com.thinhung.restful.model.entity.InvoiceEntity;
import com.thinhung.restful.repository.extensions.EmployeeRepositoryExtensions;

public class EmployeeRepositoryImpl extends BaseRepositoryImpl implements EmployeeRepositoryExtensions {

	/*
	 * Get all invoices within customer of an employee in a time period
	 */
	@Override
	public Object getCustomers(Long employeeId) {
		/*
		 * Find on INVOICES table which has {employee_id} equal this {employeeId}
		 * then get detail of that employee by finding on EMPLOYEES table which has {employee_id} equal this {employeeId} 
		 * then find on CUSTOMERS table for getting customer detail of that invoices
		 * then find on INVOICE_DETAIL for getting detail of that invoices
		 */
		String sqlQuery = "SELECT i, e, c, detail FROM InvoiceEntity i" + 
						  " INNER JOIN EmployeeEntity e ON i.employeeId = e.id AND e.id = :employeeId" + 
						  " INNER JOIN CustomerEntity c ON i.customerId = c.id"+
						  " INNER JOIN InvoiceDetailEntity detail ON i.id = detail.id";
		Query query = this.entityManager.createQuery(sqlQuery);
		query.setParameter("employeeId", employeeId);
		@SuppressWarnings("unchecked")
		List<Object[]> fetchedResults = query.getResultList();
		List<Invoice> invoices = new ArrayList<>();
		Map<String, Object> response = new HashMap<String, Object>();
		fetchedResults.stream().forEach((record) -> {
			InvoiceEntity invoiceEntity = (InvoiceEntity)record[0];
			Invoice invoice = invoiceEntity.toDomain();
			invoice.setSellDate(invoiceEntity.getSellDate());
			CustomerEntity customerEntity = (CustomerEntity)record[2];
			Customer customer = customerEntity.toDomain();
			invoice.setCustomer(customer);
			invoice.setCustomerId(invoiceEntity.getCustomerId());
			invoice.setEmployeeId(invoiceEntity.getEmployeeId());
			InvoiceDetailEntity invoiceDetailEntity = (InvoiceDetailEntity)record[3];
			invoice.setPrice(invoiceDetailEntity.getPrice());
			invoice.setQuantity(invoiceDetailEntity.getQuantity());
			invoice.setSaleOff(invoiceDetailEntity.getSaleOff());
			invoices.add(invoice);
			EmployeeEntity employeeEntity = (EmployeeEntity)record[1];
			Employee employee = employeeEntity.toDomain();
			response.put("employee", employee);
		});
		response.put("invoices", invoices);
		return response;
	}
}
