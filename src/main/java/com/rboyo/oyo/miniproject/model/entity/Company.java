package com.rboyo.oyo.miniproject.model.entity;

import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
    @Column(name="company_id")
    private int companyId;

    @Column(name="name")
    private String companyName;

    @Column(name="contact_number")
    private String companyContactNumber;

    @Column(name="email")
    private String companyEmail;

    //    private String companyCEO;

    @Column(name="address")
    private String companyAddress;

    @Column(name="pincode")
    private String companyPINcode;

    @Column(name="city")
    private String companyCity;

    @Column(name="state")
    private String companyState;

    @Column(name="country")
    private String companyCountry;

    //    private Boolean companyStatus;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyContactNumber() {
        return companyContactNumber;
    }

    public void setCompanyContactNumber(String companyContactNumber) {
        this.companyContactNumber = companyContactNumber;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPINcode() {
        return companyPINcode;
    }

    public void setCompanyPINcode(String companyPINcode) {
        this.companyPINcode = companyPINcode;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }
}
