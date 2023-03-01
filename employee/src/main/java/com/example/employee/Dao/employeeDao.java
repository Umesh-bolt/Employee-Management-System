package com.example.employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.employee.Service.EmployeeService;

public interface employeeDao extends JpaRepository<EmployeeService, String> {
    
}
