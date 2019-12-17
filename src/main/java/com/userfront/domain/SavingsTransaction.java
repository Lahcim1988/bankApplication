package com.userfront.domain;

import java.math.BigDecimal;
import java.util.Date;

public class SavingsTransaction {

    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;

    private SavingsAccount savingAccount;        // SavingsAccount field

    // constructors

    public SavingsTransaction() {
    }

    // get, set

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public SavingsAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingsAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
}
