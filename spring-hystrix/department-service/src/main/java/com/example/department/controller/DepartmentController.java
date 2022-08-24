package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long deptId) {
        return departmentService.findDepartmentById(deptId);
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
}
