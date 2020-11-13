package com.rboyo.oyo.miniproject.service;

import com.rboyo.oyo.miniproject.exception.EmployeeNotFound;
import com.rboyo.oyo.miniproject.model.entity.Employee;
import com.rboyo.oyo.miniproject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

//    private int employeeIdCount =1;
//    private List<Employee> employeeList = new CopyOnWriteArrayList<>();

    public Employee addEmployee(Employee employee){
//        employee.setEmployeeId(employeeIdCount);
//        employeeList.add(employee);
//        employeeIdCount++;
        return employeeRepo.save(employee);
//        return employee;
    }

    public Employee getEmployee(int employeeId){
//        return employeeList
//                .stream()
//                .filter(e -> e.getEmployeeId() == employeeId)
//                .findFirst()
//                .get();
        Optional<Employee> optionalEmployee = employeeRepo.findById(employeeId);

        if(!optionalEmployee.isPresent()){
            throw new EmployeeNotFound("Employee Record is not available");
        }
        return employeeRepo.findById(employeeId).get();
    }

    public List<Employee> getEmployeeList(){
//        return employeeList;
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(int employeeId, Employee employee){
//        employeeList
//                .stream()
//                .forEach(e ->{
//                        if(e.getEmployeeId() == employeeId) {
//                            if (employee.getFirstName() != null) { e.setFirstName(employee.getFirstName()); }
//                            if (employee.getLastName() != null) { e.setLastName(employee.getLastName()); }
//                            if (employee.getEmail() != null) { e.setEmail(employee.getEmail()); }
//                            if (employee.getDesignation() != null) { e.setDesignation(employee.getDesignation()); }
//                            if (employee.getDoj() != null) { e.setDoj(employee.getDoj()); }
//                            if (employee.getGender() != null) { e.setGender(employee.getGender()); }
//                            if (employee.getPhoneNumber() != null) { e.setPhoneNumber(employee.getPhoneNumber()); }
//                            if (employee.getAddress() != null) { e.setAddress(employee.getAddress()); }
//                            if (employee.getPincode() != null) { e.setPincode(employee.getPincode()); }
//                            if (employee.getCity() != null) { e.setCity(employee.getCity()); }
//                            if (employee.getState() != null) { e.setState(employee.getState()); }
//                            if (employee.getCountry() != null) { e.setCountry(employee.getCountry()); }
//                        }});
//        return employeeList
//                .stream()
//                .filter(e -> e.getEmployeeId() == employeeId)
//                .findFirst()
//                .get();
        Employee update = employeeRepo.findById(employeeId).get();

        if (employee.getFirstName() != null) { update.setFirstName(employee.getFirstName()); }
        if (employee.getLastName() != null) { update.setLastName(employee.getLastName()); }
        if (employee.getEmail() != null) { update.setEmail(employee.getEmail()); }
        if (employee.getDesignation() != null) { update.setDesignation(employee.getDesignation()); }
        if (employee.getDoj() != null) { update.setDoj(employee.getDoj()); }
        if (employee.getGender() != null) { update.setGender(employee.getGender()); }
        if (employee.getPhoneNumber() != null) { update.setPhoneNumber(employee.getPhoneNumber()); }
        if (employee.getAddress() != null) { update.setAddress(employee.getAddress()); }
        if (employee.getPincode() != null) { update.setPincode(employee.getPincode()); }
        if (employee.getCity() != null) { update.setCity(employee.getCity()); }
        if (employee.getState() != null) { update.setState(employee.getState()); }
        if (employee.getCountry() != null) { update.setCountry(employee.getCountry()); }

        update.setEmployeeId(employeeId);

        return employeeRepo.save(update);

    }

    public void deleteEmployee(int employeeId){
//        employeeList
//                .stream()
//                .forEach(e ->{
//                    if(e.getEmployeeId() == employeeId) {
//                        employeeList.remove(e);
//                    }});
        employeeRepo.deleteById(employeeId);
    }

    public List<Employee> getEmployeesByDepartment(int departmentId){
        List<Employee> employeeList = new ArrayList<>();

        employeeRepo.findByDepartmentDepartmentId(departmentId).forEach(employeeList::add);

        return employeeList;
    }
}
