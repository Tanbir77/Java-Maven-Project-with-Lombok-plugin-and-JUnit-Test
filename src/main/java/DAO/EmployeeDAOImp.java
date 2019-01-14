package DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Model.Employee;

public class EmployeeDAOImp implements EmployeeDAO {

	private List<Employee> empList;

	public EmployeeDAOImp() {
		empList = new ArrayList<>();
	}
	@Override
	public List<Employee> getEmployeeList() {

		return this.empList;
	}
	@Override
	public List<Employee> sortedEmployeeListByAge() {
		Collections.sort(this.empList, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getAge() - e2.getAge();
			}
		});
		return this.empList;
	}
	@Override
	public List<Employee> sortedEmployeeListByName() {
		Collections.sort(this.empList, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getEname().compareTo(e2.getEname());
			}
		});
		return this.empList;
	}
	@Override
	public boolean findEmployee(Employee employee) {
		return empList.contains(employee) ? true : false;
	}

	@Override
	public boolean addEmployee(Employee emp) {
		this.empList.add(emp);
		return true;
	}

}
