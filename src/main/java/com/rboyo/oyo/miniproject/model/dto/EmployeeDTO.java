package com.rboyo.oyo.miniproject.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rboyo.oyo.miniproject.model.entity.Department;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @JsonProperty(value = "employee_id")
    private int employeeId;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastName;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "designation")
    private String designation;

    @JsonProperty(value = "doj")
    private String doj;

    @JsonProperty(value = "gender")
    private String gender;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    @JsonProperty(value = "address")
    private String address;

    @JsonProperty(value = "pincode")
    private String pincode;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "state")
    private String state;

    @JsonProperty(value = "country")
    private String country;
//    private Boolean status;
//    private String salary;

   @JsonProperty(value="department_id")
    private int departmentId;
}
