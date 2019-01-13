package DAO;

import java.util.List;

import Model.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee emp);
	public List<Employee> getEmployeeList();
	public Employee findEmployee(Employee emp);
	
	

}
