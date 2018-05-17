package com.thinhung.restful.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thinhung.restful.model.domain.Invoice;

@Entity
@Table(name = "invoices")
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "sell_date")
    private Date sellDate;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "total_amount")
    private Long totalAmount;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getSellDate() {
        return sellDate;
    }
    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public Long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    public Long getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }
    public InvoiceEntity() {
        super();
    }

    public Invoice toDomain() {
        return new Invoice(id, totalAmount);
    }
}
