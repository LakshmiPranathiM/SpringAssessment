package com.example.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment.Employee;
import com.example.assessment.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		List<Employee> empList = new ArrayList<>();
		employeeRepository.findAll().forEach(empList::add);
		return empList;
	}
	
	public Employee getEmployee(String id) {
		return employeeRepository.findById(id).get();
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(String id,Employee employee) {
		employeeRepository.save(employee);
	}
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
	
}
