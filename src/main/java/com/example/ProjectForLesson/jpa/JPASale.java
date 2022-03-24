package com.example.ProjectForLesson.jpa;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "sales")
public class JPASale {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Convert(disableConversion = true)
    @Column(name = "incoming_date", nullable = false)
    private Instant incomingDate;

    @Column(name = "productid", nullable = false)
    private Integer productid;

    @Convert(disableConversion = true)
    @Column(name = "sale_date", nullable = false)
    private Instant saleDate;

    public Instant getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Instant saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Instant getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(Instant incomingDate) {
        this.incomingDate = incomingDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("ID: %d. Amount: %d. Incoming date: %s. Sale date: %s. Product ID: %d", this.id, this.amount, this.incomingDate, this.saleDate, this.productid);
    }
}