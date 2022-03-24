package com.example.ProjectForLesson.jdbc;

import java.util.Date;

public class JDBCSales {
    private int id;
    private long amount;
    private Date incomingDate;
    private Date saleDate;
    private int productID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
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

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public JDBCSales(int id, long amount, Date incomingDate, Date saleDate, int productID) {
        this.id = id;
        this.amount = amount;
        this.incomingDate = incomingDate;
        this.saleDate = saleDate;
        this.productID = productID;
    }

    @Override
    public String toString() {
        return String.format("ID: %d. Amount: %d. Incoming date: %s. Sale date: %s. Product ID: %d", this.id, this.amount, this.incomingDate, this.saleDate, this.productID);
    }
}
