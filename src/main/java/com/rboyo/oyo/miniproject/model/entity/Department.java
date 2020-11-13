package com.rboyo.oyo.miniproject.model.entity;

<<<<<<< Updated upstream
public class Department {

=======
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
>>>>>>> Stashed changes
    private int departmentId;
    private String departmentName;
    private String departmentContactNumber;
    private String departmentEmail;
//    private String departmentManager;
    private String departmentAddress;
    private String departmentPINcode;
    private String departmentCity;
    private String departmentState;
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
