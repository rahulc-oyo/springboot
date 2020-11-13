package com.rboyo.oyo.miniproject.service;

//import com.rboyo.oyo.miniproject.exception.EmployeeNotFound;
import com.rboyo.oyo.miniproject.model.entity.Company;
import com.rboyo.oyo.miniproject.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

    public Company addCompany(Company company){
        return companyRepo.save(company);
    }

    public Company getCompany(int companyId){
//        Optional<Company> optionalCompany = companyRepo.findById(companyId);
//
//        if(!optionalCompany.isPresent()){
//            throw new EmployeeNotFound("Employee Record is not available");
//        }
        return companyRepo.findById(companyId).get();
    }

    public List<Company> getCompanyList(){
        return companyRepo.findAll();
    }

    public Company updateCompany(int companyId, Company company){
        Company update = companyRepo.findById(companyId).get();

        if (company.getCompanyName() != null) { update.setCompanyName(company.getCompanyName()); }
        if (company.getCompanyEmail() != null) { update.setCompanyEmail(company.getCompanyEmail()); }
        if (company.getCompanyContactNumber() != null) { update.setCompanyContactNumber(company.getCompanyContactNumber()); }
        if (company.getCompanyAddress() != null) { update.setCompanyAddress(company.getCompanyAddress()); }
        if (company.getCompanyPINcode() != null) { update.setCompanyPINcode(company.getCompanyPINcode()); }
        if (company.getCompanyCity() != null) { update.setCompanyCity(company.getCompanyCity()); }
        if (company.getCompanyState() != null) { update.setCompanyState(company.getCompanyState()); }
        if (company.getCompanyCountry() != null) { update.setCompanyCountry(company.getCompanyCountry()); }

        update.setCompanyId(companyId);

        return companyRepo.save(update);

    }

    public void deleteCompany(int companyId){
        companyRepo.deleteById(companyId);
    }
}

