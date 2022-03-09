package com.revature.service;

import java.util.List;
import java.util.Optional;

import com.revature.dao.EmployeeDao;
import com.revature.models.Employee;

public class EmployeeService {

	private EmployeeDao edao;
	
	public EmployeeService(EmployeeDao edao) {
		this.edao = edao;
	}
	
	public Employee comfirmLogin(String username, String password) {
		Optional<Employee> possibleEmp = edao.findall().stream()
				.filter(e->(e.getUsername().equals(username)&& e.getPassword().equals(password)))
				.findFirst();
		
		return (possibleEmp.isPresent()?possibleEmp.get():null);
	}
	
	public List<Employee> findAll(){
		return edao.findall();
	}
	
	public int insert(Employee e) {
		return edao.insert(e);
	}
}
