package com.sangnd.api.appspring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table (name = "contact")
public class Contact {

    @Id
    @Column(name="contact_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contactID;

    @Column(name="name")
    private String name;
    @Column(name="dob")
    private Date dob;
    @Column(name="age")
    private int age;
    @Column(name="email")
    private String email;

    @NotNull
    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    public Contact(){
    }

    public Contact(int contactID, String name, Date dob, int age, String email, Company company) {
        this.contactID = contactID;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.company = company;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}