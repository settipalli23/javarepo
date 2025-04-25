package com.practie.springboot_ex.service;

import com.practie.springboot_ex.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {

    // Save operation
    public Department saveDepartment(Department department);

    public Iterable<Department> getAllDepartmentsDetails();
}
