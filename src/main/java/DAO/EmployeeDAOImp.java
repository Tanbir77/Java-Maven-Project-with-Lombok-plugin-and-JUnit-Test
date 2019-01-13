package DAO;

import java.util.ArrayList;
import java.util.List;

import Model.Employee;

public class EmployeeDAOImp implements EmployeeDAO{
    
	private List<Employee> empList;
	
	public EmployeeDAOImp() {
		empList=new ArrayList<>();
	}

	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
	public static boolean test() {
		return true;
	}

	@Override
	public boolean addEmployee(Employee emp) {
		this.empList.add(emp);
		return true;
	}
	
	public boolean returnTrue() {
		return true;
	}

}
