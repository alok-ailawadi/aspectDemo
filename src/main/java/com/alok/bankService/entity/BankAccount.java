package com.alok.bankService.entity;

import com.alok.annotations.Encrypt;

import javax.persistence.*;

/**
 * Created by Alok on 1/22/2017.
 */
@Entity
@Table(name = "Bank_Account")
@NamedQuery(name = "BankAccount.findAll", query = "SELECT t FROM BankAccount t")
public class BankAccount {

    @Id
    private String id;
    @Column(name = "userId" )
    private String userId;

    @Column(name = "bankAccountNo" )
    private String bankAccountNo;

    @Column(name = "ifsc" )
    private String ifsc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    @Encrypt
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
}
