package practice3;

import java.util.*;

public class P2 {

	public static void main(String[] args) {
		// HashSet�� ��ü�� ����ϱ� ���ؼ� hashCode �޼ҵ�Ӹ� �ƴ϶�
		// equals �޼ҵ嵵 �������̵��� �ؾ��Ѵ�
		Set<Employee> employees = new HashSet<Employee>();
		
		employees.add(new Employee("�ȼ���","001"));
		employees.add(new Employee("�ȼ���","001"));
		employees.add(new Employee("������","002"));
		
		for (Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSabeon());
		}
		
		
	}
}
