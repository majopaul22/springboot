package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }
    public Department findDepartmentById(Long deptId) {
        return departmentRepo.findDepartmentByDeptId(deptId);
    }
}
