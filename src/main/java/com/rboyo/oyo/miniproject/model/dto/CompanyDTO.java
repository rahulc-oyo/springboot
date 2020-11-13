package com.rboyo.oyo.miniproject.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {

    @JsonProperty(value = "company_id")
    private int companyId;

    @JsonProperty(value = "name")
    private String companyName;

    @JsonProperty(value = "contact_number")
    private String companyContactNumber;

    @JsonProperty(value = "email")
    private String companyEmail;

    //    private String companyCEO;

    @JsonProperty(value = "address")
    private String companyAddress;

    @JsonProperty(value = "pincode")
    private String companyPINcode;

    @JsonProperty(value = "city")
    private String companyCity;

    @JsonProperty(value = "state")
    private String companyState;

    @JsonProperty(value = "country")
    private String companyCountry;

//    private Boolean companyStatus;

}
