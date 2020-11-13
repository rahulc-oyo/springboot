package com.rboyo.oyo.miniproject.model.entity;

<<<<<<< Updated upstream
public class Company {

    private int companyId;
    private String companyName;
    private String companyContactNumber;
=======
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
>>>>>>> Stashed changes
    private String companyEmail;
    //    private String companyCEO;
<<<<<<< Updated upstream
    private String companyAddress;
    private String companyPINcode;
    private String companyCity;
    private String companyState;
    private String companyCountry;
    //    private Boolean companyStatus;
=======

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

>>>>>>> Stashed changes
}
