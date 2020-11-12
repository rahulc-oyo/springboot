package com.rboyo.oyo.miniproject.controller;

import com.rboyo.oyo.miniproject.model.entity.Department;
import com.rboyo.oyo.miniproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }
    @GetMapping
    public List<Department> getDepartmentList(){
        return departmentService.getDepartmentList();
    }

    @GetMapping(value ="/{departmentId}")
    public Department getDepartment(@PathVariable("departmentId") int departmentId){
        return departmentService.getDepartment(departmentId);
    }

    @PutMapping(value ="/{departmentId}")
    public Department updateDepartment(@PathVariable("departmentId") int departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }

    @DeleteMapping(value ="/{departmentId}")
    public void deleteDepartment(@PathVariable("departmentId") int departmentId){
        departmentService.deleteDepartment(departmentId);
    }
}
