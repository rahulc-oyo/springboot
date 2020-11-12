package com.rboyo.oyo.miniproject.service;

import com.rboyo.oyo.miniproject.exception.EmployeeNotFound;
import com.rboyo.oyo.miniproject.model.entity.Department;
import com.rboyo.oyo.miniproject.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department addDepartment(Department department){
        return departmentRepo.save(department);
    }

    public Department getDepartment(int departmentId){
//        Optional<Department> optionalDepartment = departmentRepo.findById(departmentId);
//
//        if(!optionalDepartment.isPresent()){
//            throw new EmployeeNotFound("Employee Record is not available");
//        }
        return departmentRepo.findById(departmentId).get();
    }

    public List<Department> getDepartmentList(){
        return departmentRepo.findAll();
    }

    public Department updateDepartment(int departmentId, Department department){
        Department update = departmentRepo.findById(departmentId).get();

        if (department.getDepartmentName() != null) { update.setDepartmentName(department.getDepartmentName()); }
        if (department.getDepartmentEmail() != null) { update.setDepartmentEmail(department.getDepartmentEmail()); }
        if (department.getDepartmentContactNumber() != null) { update.setDepartmentContactNumber(department.getDepartmentContactNumber()); }
        if (department.getDepartmentAddress() != null) { update.setDepartmentAddress(department.getDepartmentAddress()); }
        if (department.getDepartmentPINcode() != null) { update.setDepartmentPINcode(department.getDepartmentPINcode()); }
        if (department.getDepartmentCity() != null) { update.setDepartmentCity(department.getDepartmentCity()); }
        if (department.getDepartmentState() != null) { update.setDepartmentState(department.getDepartmentState()); }
        if (department.getDepartmentCountry() != null) { update.setDepartmentCountry(department.getDepartmentCountry()); }

        update.setDepartmentId(departmentId);

        return departmentRepo.save(update);

    }

    public void deleteDepartment(int departmentId){
        departmentRepo.deleteById(departmentId);
    }
}


