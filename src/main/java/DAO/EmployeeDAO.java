package DAO;

import java.util.List;

import Model.Employee;

public interface EmployeeDAO {
	public List<Employee> getEmployeeList();

	public List<Employee> sortedEmployeeListByName();

	public List<Employee> sortedEmployeeListByAge();

	public boolean findEmployee(Employee employee);

	public boolean addEmployee(Employee emp);

}
