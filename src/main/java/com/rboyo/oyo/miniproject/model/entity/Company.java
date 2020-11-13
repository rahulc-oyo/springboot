package com.rboyo.oyo.miniproject.model.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="company")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private int companyId;

    @Column(name = "name")
    private String companyName;

    @Column(name = "contact_number")
    private String companyContactNumber;

    @Column(name = "email")
    private String companyEmail;

    @Column(name = "address")
    private String companyAddress;

    @Column(name = "pincode")
    private String companyPINcode;

    @Column(name = "city")
    private String companyCity;

    @Column(name = "state")
    private String companyState;

    @Column(name = "country")
    private String companyCountry;

//    private Boolean companyStatus;

    @OneToMany(mappedBy = "company")
    @Fetch(FetchMode.JOIN)
    private List<Department> departmentList;

}
