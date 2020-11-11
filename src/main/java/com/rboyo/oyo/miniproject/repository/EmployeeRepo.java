package com.rboyo.oyo.miniproject.repository;

import com.rboyo.oyo.miniproject.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

    @Override
    List<Employee> findAll();
}
