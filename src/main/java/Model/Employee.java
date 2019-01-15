package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Tanbirul Hashan
 *
 */

@Data
@AllArgsConstructor

public class Employee {
	private int eId;
	private String Ename;
	private int age;

}
