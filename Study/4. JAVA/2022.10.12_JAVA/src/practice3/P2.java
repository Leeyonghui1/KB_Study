package practice3;

import java.util.*;

public class P2 {

	public static void main(String[] args) {
		// HashSet을 객체로 사용하기 위해선 hashCode 메소드뿐만 아니라
		// equals 메소드도 오버라이딩을 해야한다
		Set<Employee> employees = new HashSet<Employee>();
		
		employees.add(new Employee("안서준","001"));
		employees.add(new Employee("안서준","001"));
		employees.add(new Employee("이현민","002"));
		
		for (Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSabeon());
		}
		
		
	}
}
