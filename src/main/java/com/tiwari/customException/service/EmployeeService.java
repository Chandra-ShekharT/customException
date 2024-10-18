package com.tiwari.customException.service;


import com.tiwari.customException.config.CustomException;
import com.tiwari.customException.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class EmployeeService  {

    final List<Employee> list = new ArrayList<>();

    public Employee createEmployee(Employee emp) {

        list.add(emp);
        return emp;

    }

    public Employee getEmployeeById(Long id) {

        return list.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElseThrow(() -> new CustomException("employee not found "+id));

    }


    public List<Employee> getAllEmployee() {

        return list;
    }
}
