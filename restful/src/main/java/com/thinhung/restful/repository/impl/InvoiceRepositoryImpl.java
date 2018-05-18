package com.thinhung.restful.repository.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.thinhung.restful.model.domain.Summary;
import com.thinhung.restful.repository.extensions.InvoiceRepositoryExtensions;

public class InvoiceRepositoryImpl extends BaseRepositoryImpl implements InvoiceRepositoryExtensions {
    @Override
    public Object summary(Long employeeId, Date fromDate, Date toDate) throws Exception {
        
        String sqlString = "SELECT e.id, e.name, i.totalAmount, i.sellDate FROM EmployeeEntity e INNER JOIN InvoiceEntity i" +
                                        " ON e.id = :employeeId AND e.id = i.employeeId" + 
                                        " AND i.sellDate >= :fromDate AND i.sellDate <= :toDate";
                Query query = this.entityManager.createQuery(sqlString);
        query.setParameter("fromDate", fromDate);
        query.setParameter("toDate", toDate);
        query.setParameter("employeeId", employeeId);

        List<Summary> summaries = new ArrayList<>();
        @SuppressWarnings("unchecked")
        List<Object[]> results = query.getResultList();
        results.stream().forEach((record) -> {
            int count = record.length;
            if (count == 4) {
                Long id = (Long)record[0];
                String name = (String)record[1];
                Long totalAmount = (Long)record[2];
                Summary summary = new Summary(id, name, totalAmount);
                summary.setSellDate((Date)record[3]);
                summaries.add(summary);
            }
        });

        return summaries;
    }
}
