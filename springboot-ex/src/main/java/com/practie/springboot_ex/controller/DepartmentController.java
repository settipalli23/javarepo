package com.practie.springboot_ex.controller;

import com.practie.springboot_ex.model.Department;
import com.practie.springboot_ex.service.DepartmentService;
import com.practie.springboot_ex.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/api/")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping(value="/departments")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){

        Department dept = departmentService.saveDepartment(department);

        return new ResponseEntity<Department>(dept, HttpStatus.CREATED);

    }

}
