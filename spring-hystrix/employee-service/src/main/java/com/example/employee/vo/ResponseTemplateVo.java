package com.example.employee.vo;

import com.example.employee.entity.Employee;
import lombok.Data;

@Data
public class ResponseTemplateVo {
    Department department;
    Employee employee;

}
