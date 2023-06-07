package com.application.apiapplication.service;

import com.application.apiapplication.model.Employee;

import java.util.List;

public interface EmployeeService {

    /*SPECIFICATIONS*/
    // save an employee
    void addEmployee(Employee employee);

    // get employees
    List<Employee> getAllEmployees();

    // get one employee
    Employee getEmployeeById(Integer id);

    // update employee
    void updateEmployee(Employee employee);

    // delete employee
    Boolean deleteEmployeeById(Integer id);
}
