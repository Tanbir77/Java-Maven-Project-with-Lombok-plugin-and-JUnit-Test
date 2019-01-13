package naztech.io.JavaTimeMavenProject;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import DAO.*;
import Model.Employee;

public class EmployeeTest {
     
	//static EmployeeDAO empDAO;
	@BeforeClass
	public static void beforeClass() {
		
		
	}
	@Test
	public void addEmployeeTest() {
		EmployeeDAO empDAO=new EmployeeDAOImp();
		
		assertTrue(empDAO.addEmployee(new Employee(2," ",23)));
	}
}
