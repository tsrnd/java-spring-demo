package com.thinhung.restful.model.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Summary {
    private Long id;
    private String name;
    @JsonProperty(value = "total_amount")
    private Long totalAmount;
    @JsonProperty(value = "sell_date")
    private Date sellDate;
    
    public Summary(Long id, String name, Long totalAmount) {
        super();
        this.id = id;
        this.name = name;
        this.totalAmount = totalAmount;
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

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }
}
