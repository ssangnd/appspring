package com.sangnd.api.appspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="company")
public class Company {

    @Id
    @Column(name="company_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int companyID;
    private String companyName ;

    //constructor
    public Company() {

    }
    public Company(int companyID) {
        this.companyID = companyID;
    }

    //constructor
    public Company(int companyID, String companyName) {
        this.companyID = companyID;
        this.companyName = companyName;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}