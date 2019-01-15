package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Department {
	private String dId;
//	private String dName;
//	private String dAddress;
	private Map<String,Employee> map;
	public Department(String id ) {
		this.dId=id;
		map=new HashMap<>();
	}
	public boolean  addEmployee(String id,Employee emp) {
		map.put(id, emp);
		return true;
	}
	public List<Employee> sortedEmployee(){
		List<Employee> list=new ArrayList<Employee>(map.values());
		Collections.sort(list, (m1,m2)->{
			return m1.getEname().compareTo(m2.getEname());
		});
		return null; 
	}
}
