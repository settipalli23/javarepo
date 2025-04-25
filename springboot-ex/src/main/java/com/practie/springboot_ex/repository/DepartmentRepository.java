package com.practie.springboot_ex.repository;

import com.practie.springboot_ex.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository  extends CrudRepository<Department, Long> {

    @NonNull
    Iterable<Department> findAll();

}
