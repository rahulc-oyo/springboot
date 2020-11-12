package com.rboyo.oyo.miniproject.repository;

import com.rboyo.oyo.miniproject.model.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepo extends CrudRepository<Company, Integer> {

    @Override
    List<Company> findAll();
}
