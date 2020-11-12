package com.rboyo.oyo.miniproject.controller;

import com.rboyo.oyo.miniproject.model.entity.Company;
import com.rboyo.oyo.miniproject.model.entity.Department;
import com.rboyo.oyo.miniproject.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public Company addCompany(@RequestBody Company company){
        return companyService.addCompany(company);
    }

    @GetMapping
    public List<Company> getCompanyList(){
        return companyService.getCompanyList();
    }

    @GetMapping(value="/{companyId}")
    public Company getCompany(@PathVariable("companyId") int companyId){
        return companyService.getCompany(companyId);
    }

    @PutMapping(value ="/{companyId}")
    public Company updateCompany(@PathVariable("companyId") int companyId, @RequestBody Company company){
        return companyService.updateCompany(companyId, company);
    }

    @DeleteMapping(value ="/{companyId}")
    public void deleteCompany(@PathVariable("companyId") int companyId){
        companyService.deleteCompany(companyId);
    }
}
