package com.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Transaction {
    private int id;
    private User buyer;
    private User seller;
    private BigDecimal companyFine;
    private BigDecimal payment;
    private Timestamp date;

    public int getId() { return this.id;  }

    public User getBuyer() { return this.buyer; }

    public User getSeller() { return this.seller; }

    public BigDecimal getCompanyFine() { return this.companyFine; }

    public BigDecimal getPayment() { return this.payment; }

    public Timestamp getDate() { return this.date; }

    public void setId(int id) { this.id = id; }

    public void setBuyer(User buyer) { this.buyer = buyer; }

    public void setSeller(User seller) { this.seller = seller; }

    public void setCompanyFine(BigDecimal companyFine) { this.companyFine = companyFine; }

    public void setPayment(BigDecimal payment) { this.payment = payment; }

    public void setDate(Timestamp date) { this.date = date; }
}
