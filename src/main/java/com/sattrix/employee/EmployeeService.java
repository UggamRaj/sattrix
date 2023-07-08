package com.sattrix.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveData(Employee employee) throws EmployeeException {
		if(employee!=null) {
			Employee employee2= repository.save(employee);
			return employee2;
		}else {
			throw new EmployeeException("your sending null data");
		}
		
	}
	
	public List<Employee> getAllEmployee() throws EmployeeException{
		List<Employee> list= repository.findAll();
		if(list.isEmpty()) {
			throw new EmployeeException("there is no data found");
		}
		return list;
	}
	
	public List<Employee> getByDepartmentName(String name) throws EmployeeException{
		List<Employee> list= repository.findByDepartentName(name);
		if(list.isEmpty()) {
			throw new EmployeeException("there is no data found by "+name);
		}
		return list;

	}
}
