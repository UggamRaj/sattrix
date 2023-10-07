package com.sattrix.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	//done
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveData(@RequestBody Employee employee) throws EmployeeException{
	Employee employee2=service.saveData(employee);
	return new ResponseEntity<Employee>(employee2, HttpStatus.CREATED);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAllEmployee() throws EmployeeException{
		List<Employee> list= service.getAllEmployee();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getbydepartment/{name}")
	public ResponseEntity<List<Employee>> getByDepartmentName(@PathVariable String name) throws EmployeeException{
		List<Employee> list= service.getByDepartmentName(name);
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	

}
