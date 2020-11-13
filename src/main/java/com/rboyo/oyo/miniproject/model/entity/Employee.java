package com.rboyo.oyo.miniproject.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="employee")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{

//    @JsonProperty
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "designation")
    private String designation;

    @Column(name = "doj")
    private String doj;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;
//    private Boolean status;
//    private String salary;

    @ManyToOne(cascade = CascadeType.MERGE)
    @Fetch(FetchMode.JOIN)
    @JsonIgnore
    @JoinColumn(name="department_id", nullable = false)
    private Department department;

}
