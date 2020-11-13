package com.rboyo.oyo.miniproject.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="department")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    @ManyToOne(cascade = CascadeType.MERGE)
    @Fetch(FetchMode.JOIN)
    @JsonIgnore
    @JoinColumn(name="company_id", nullable = false)
    private Company company;

}
