package com.rboyo.oyo.miniproject.model.entity;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_seq")
    @Column(name="department_id")
    private int departmentId;

    @Column(name="name")
    private String departmentName;

    @Column(name="contact_number")
    private String departmentContactNumber;

    @Column(name="email")
    private String departmentEmail;

//    private String departmentManager;

    @Column(name="address")
    private String departmentAddress;

    @Column(name="pincode")
    private String departmentPINcode;

    @Column(name="city")
    private String departmentCity;

    @Column(name="state")
    private String departmentState;

    @Column(name="country")
    private String departmentCountry;
    //    private Boolean departmentStatus;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentContactNumber() {
        return departmentContactNumber;
    }

    public void setDepartmentContactNumber(String departmentContactNumber) {
        this.departmentContactNumber = departmentContactNumber;
    }

    public String getDepartmentEmail() {
        return departmentEmail;
    }

    public void setDepartmentEmail(String departmentEmail) {
        this.departmentEmail = departmentEmail;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentPINcode() {
        return departmentPINcode;
    }

    public void setDepartmentPINcode(String departmentPINcode) {
        this.departmentPINcode = departmentPINcode;
    }

    public String getDepartmentCity() {
        return departmentCity;
    }

    public void setDepartmentCity(String departmentCity) {
        this.departmentCity = departmentCity;
    }

    public String getDepartmentState() {
        return departmentState;
    }

    public void setDepartmentState(String departmentState) {
        this.departmentState = departmentState;
    }

    public String getDepartmentCountry() {
        return departmentCountry;
    }

    public void setDepartmentCountry(String departmentCountry) {
        this.departmentCountry = departmentCountry;
    }

}
