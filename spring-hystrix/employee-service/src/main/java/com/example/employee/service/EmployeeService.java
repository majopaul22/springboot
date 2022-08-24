package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepo;
import com.example.employee.vo.Department;
import com.example.employee.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private RestTemplate restTemplate;

    public Employee getEmployee(Long employeeId) {
        return employeeRepo.findByEmployeeId(employeeId);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public ResponseTemplateVo getEmployeeWithDepartment(Long employeeId) {
        ResponseTemplateVo responseTemplateVo = new ResponseTemplateVo();
        Employee employee = employeeRepo.findByEmployeeId(employeeId);
        Department department = restTemplate.getForObject(
                "http://DEPARTMENT-SERVICE/department/" + employee.getDeptId(),
                Department.class);
        responseTemplateVo.setEmployee(employee);
        responseTemplateVo.setDepartment(department);
        return responseTemplateVo;
    }
}
