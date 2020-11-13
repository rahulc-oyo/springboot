package com.rboyo.oyo.miniproject.controller;

import com.rboyo.oyo.miniproject.model.dto.DepartmentDTO;
import com.rboyo.oyo.miniproject.model.dto.EmployeeDTO;
import com.rboyo.oyo.miniproject.model.entity.Department;
import com.rboyo.oyo.miniproject.model.entity.Employee;
import com.rboyo.oyo.miniproject.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value ="/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
        ModelMapper modelMapper = new ModelMapper();
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        employee = employeeService.addEmployee(employee);
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    @GetMapping
    public List<EmployeeDTO> getEmployeeList(){
        ModelMapper modelMapper = new ModelMapper();
        List<Employee> employeeList = employeeService.getEmployeeList();
        return Arrays.asList(modelMapper.map(employeeList, EmployeeDTO[].class));
    }

    @GetMapping(value ="/{employeeId}")
    public EmployeeDTO getEmployee(@PathVariable("employeeId") int employeeId){
        ModelMapper modelMapper = new ModelMapper();
        Employee employee = employeeService.getEmployee(employeeId);
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    @PutMapping(value ="/{employeeId}")
    public EmployeeDTO updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody EmployeeDTO employeeDTO){
        ModelMapper modelMapper = new ModelMapper();
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        employee = employeeService.updateEmployee(employeeId, employee);
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    @DeleteMapping(value ="/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId){
        employeeService.deleteEmployee(employeeId);
    }

    @GetMapping(value ="/department/{departmentId}")
    public List<EmployeeDTO> getEmployeesByDepartment(@PathVariable("departmentId") int departmentId){
        ModelMapper modelMapper = new ModelMapper();
        List<Employee> employeeList = employeeService.getEmployeesByDepartment(departmentId);
        return Arrays.asList(modelMapper.map(employeeList, EmployeeDTO[].class));
    }
}
