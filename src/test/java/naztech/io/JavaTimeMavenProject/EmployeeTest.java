package naztech.io.JavaTimeMavenProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import DAO.EmployeeDAO;
import DAO.EmployeeDAOImp;
import Model.Employee;

public class EmployeeTest {

	static EmployeeDAO empDAO;
	static List<Employee> empList;

	@BeforeClass
	public static void beforeClass() {
		
		empDAO = new EmployeeDAOImp();
		empList=new ArrayList<>();
		
		Employee e1 = new Employee(1, "Tanbir", 23);
		Employee e2 = new Employee(2, "Rana", 23);
		Employee e3 = new Employee(3, "Rafi", 24);
		Employee e4 = new Employee(4, "Msekh", 28);
		Employee e5 = new Employee(5, "Riyad", 25);
		
		empDAO.addEmployee(e3);  empList.add(e3);
		empDAO.addEmployee(e1);  empList.add(e1);
		empDAO.addEmployee(e2);  empList.add(e2);
		empDAO.addEmployee(e4);  empList.add(e4);
		empDAO.addEmployee(e5);  empList.add(e5);
							

	}
	
	@Test
	public void getEmployeeListTest() {
		assertEquals(empList, empDAO.getEmployeeList());
		empList.remove(empList.size()-1);
		assertNotEquals(empList, empDAO.getEmployeeList());
	}
	@Test
	public void sortedEmployeeByNameTest() {
		Collections.sort(empList,(e1,e2)->{
			return e1.getEname().compareTo(e2.getEname());
		});
		assertEquals(empList, empDAO.sortedEmployeeListByName());
		assertNotEquals(empList, empDAO.sortedEmployeeListByAge());
	}
	@Test
	public void addEmployeeTest() {
		assertTrue(empDAO.addEmployee(new Employee(6, "Riyaaa", 26)));
		
	}
	 @Test
	 public void findEmployeeTest() {
		 assertTrue(empDAO.findEmployee(new Employee(4, "mSekh", 28)));
	 }
	

}
