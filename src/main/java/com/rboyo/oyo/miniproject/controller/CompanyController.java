package com.rboyo.oyo.miniproject.controller;

import com.rboyo.oyo.miniproject.model.dto.CompanyDTO;
import com.rboyo.oyo.miniproject.model.entity.Company;
import com.rboyo.oyo.miniproject.service.CompanyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public CompanyDTO addCompany(@RequestBody CompanyDTO companyDTO){
        ModelMapper modelMapper = new ModelMapper();
        Company company = modelMapper.map(companyDTO, Company.class);
        company = companyService.addCompany(company);
        return modelMapper.map(company, CompanyDTO.class);
    }

    @GetMapping
    public List<CompanyDTO> getCompanyList(){
        ModelMapper modelMapper = new ModelMapper();
        List<Company> companyList = companyService.getCompanyList();
        return Arrays.asList(modelMapper.map(companyList, CompanyDTO[].class));
    }

    @GetMapping(value="/{companyId}")
    public CompanyDTO getCompany(@PathVariable("companyId") int companyId){
        ModelMapper modelMapper = new ModelMapper();
        Company company = companyService.getCompany(companyId);
        return modelMapper.map(company, CompanyDTO.class);
    }

    @PutMapping(value ="/{companyId}")
    public CompanyDTO updateCompany(@PathVariable("companyId") int companyId, @RequestBody CompanyDTO companyDTO){
        ModelMapper modelMapper = new ModelMapper();
        Company company = modelMapper.map(companyDTO, Company.class);
        company = companyService.updateCompany(companyId, company);
        return modelMapper.map(company, CompanyDTO.class);
    }

    @DeleteMapping(value ="/{companyId}")
    public void deleteCompany(@PathVariable("companyId") int companyId){
        companyService.deleteCompany(companyId);
    }
}
