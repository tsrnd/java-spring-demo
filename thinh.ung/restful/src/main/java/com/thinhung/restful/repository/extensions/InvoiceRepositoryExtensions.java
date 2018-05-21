package com.thinhung.restful.repository.extensions;

import java.util.Date;

public interface InvoiceRepositoryExtensions {
	public Object summary(Long employeeId, Date fromDate, Date toDate) throws Exception; 
}
