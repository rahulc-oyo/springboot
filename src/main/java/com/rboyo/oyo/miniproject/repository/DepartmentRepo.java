package com.rboyo.oyo.miniproject.repository;

import com.rboyo.oyo.miniproject.model.entity.Department;
import com.rboyo.oyo.miniproject.model.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer> {

    List<Department> findByCompanyCompanyId(int companyId);

    @Override
    List<Department> findAll();
}
