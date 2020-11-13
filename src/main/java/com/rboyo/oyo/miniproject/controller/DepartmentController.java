package com.rboyo.oyo.miniproject.controller;

import com.rboyo.oyo.miniproject.model.dto.DepartmentDTO;
import com.rboyo.oyo.miniproject.model.entity.Department;
import com.rboyo.oyo.miniproject.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public DepartmentDTO addDepartment(@RequestBody DepartmentDTO departmentDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Department department = modelMapper.map(departmentDTO, Department.class);
        department = departmentService.addDepartment(department);
        return modelMapper.map(department, DepartmentDTO.class);
    }
    @GetMapping
    public List<DepartmentDTO> getDepartmentList(){
        ModelMapper modelMapper = new ModelMapper();
        List<Department> departmentList = departmentService.getDepartmentList();
        return Arrays.asList(modelMapper.map(departmentList, DepartmentDTO[].class));
    }

    @GetMapping(value ="/{departmentId}")
    public DepartmentDTO getDepartment(@PathVariable("departmentId") int departmentId){
        ModelMapper modelMapper = new ModelMapper();
        Department department = departmentService.getDepartment(departmentId);
        return modelMapper.map(department, DepartmentDTO.class);
    }

    @PutMapping(value ="/{departmentId}")
    public DepartmentDTO updateDepartment(@PathVariable("departmentId") int departmentId, @RequestBody DepartmentDTO departmentDTO){
        ModelMapper modelMapper = new ModelMapper();
        Department department = modelMapper.map(departmentDTO, Department.class);
        department = departmentService.updateDepartment(departmentId, department);
        return modelMapper.map(department, DepartmentDTO.class);
    }

    @DeleteMapping(value ="/{departmentId}")
    public void deleteDepartment(@PathVariable("departmentId") int departmentId){
        departmentService.deleteDepartment(departmentId);
    }

    @GetMapping(value ="/company/{companyId}")
    public List<DepartmentDTO> getDepartmentsByCompany(@PathVariable("companyId") int companyId){
        ModelMapper modelMapper = new ModelMapper();
        List<Department> departmentList = departmentService.getDepartmentsByCompany(companyId);
        return Arrays.asList(modelMapper.map(departmentList, DepartmentDTO[].class));
    }
}
