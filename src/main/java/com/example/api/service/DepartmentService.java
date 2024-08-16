package com.example.api.service;

import com.example.api.model.Department;
import com.example.api.repository.DepartmentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Optional<Department> getDepartment(Long id) {
        return departmentRepository.findById(id);
    }

    public Iterable<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
