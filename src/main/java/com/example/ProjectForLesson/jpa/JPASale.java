package com.example.ProjectForLesson.jpa;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "sales")
public class JPASale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Convert(disableConversion = true)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "incoming_date", nullable = false)
    private Date incomingDate;

    @Convert(disableConversion = true)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "sale_date", nullable = false)
    private Date saleDate;

    @Column(name = "product_id", nullable = false)
    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(Date incomingDate) {
        this.incomingDate = incomingDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return String.format("ID: %d. Amount: %d. Incoming date: %s. Sale date: %s. Product ID: %d", this.id, this.amount, this.incomingDate, this.saleDate, this.productId);
    }
}