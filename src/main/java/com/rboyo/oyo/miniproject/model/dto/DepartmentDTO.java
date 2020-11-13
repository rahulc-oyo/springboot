package com.rboyo.oyo.miniproject.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    @JsonProperty(value="department_id")
    private int departmentId;

    @JsonProperty(value="name")
    private String departmentName;

    @JsonProperty(value="contact_number")
    private String departmentContactNumber;

    @JsonProperty(value="email")
    private String departmentEmail;

//    private String departmentManager;

    @JsonProperty(value="address")
    private String departmentAddress;

    @JsonProperty(value="pincode")
    private String departmentPINcode;

    @JsonProperty(value="city")
    private String departmentCity;

    @JsonProperty(value="state")
    private String departmentState;

    @JsonProperty(value="country")
    private String departmentCountry;
    //    private Boolean departmentStatus;

    @JsonProperty(value = "company_id")
    private int companyId;
}
