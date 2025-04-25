package com.practie.springboot_ex.service;

import com.practie.springboot_ex.model.Department;
import org.springframework.stereotype.Service;


public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);
}
