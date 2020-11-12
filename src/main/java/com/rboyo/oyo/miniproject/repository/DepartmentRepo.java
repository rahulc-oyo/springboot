package com.rboyo.oyo.miniproject.repository;

import com.rboyo.oyo.miniproject.model.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer> {

    @Override
    List<Department> findAll();
}
