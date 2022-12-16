package practice3;

import java.util.*;
import test1Sol.KBStudent;

public class P1 {

	public static void main(String[] args) {
		// Java���� ũ�� List, Set, Map 3������ ����
		
		// List�� ArrayList���� �پ��� ������ ����
		/*
		List<Integer> ex1 = new ArrayList<Integer>();
		List<Integer> ex2 = new LinkedList<Integer>();
		List<Integer> ex3 = new Stack<Integer>();
		List<Integer> ex4 = new Vector<Integer>();
		Queue<Integer> ex5 = new LinkedList<Integer>();
		*/
		// Map, Set
		// C#�� dictionary, python dict�� ������
		// Map���� ��ǥ���ΰ��� HashMap
		// Hash :: �� �����͸� �����ϴ� ������(Ȥ�� �����ڵ�)
		// ���
		// Map :: Ű ���� ������ ���� ���� �����ϰ� Ű ���� �ߺ��Ǹ� ���� ������ �� ����
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "�ȼ���");
		students.put(2, "�̵���");
		students.put(1, "����ȣ"); // Ű ���� ��ġ�Ƿ� ���� �� ���
		students.put(3, "����ȣ"); // ������ ���� ���Ƶ� Ű ���� �ٸ��� �ٸ� ������
		for(int key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		// Set :: �ߺ��� ������� �ʴ� ����Ʈ, ������ ����(���� �� �����Ͱ� ���߿� ��µǱ⵵ ��)
		Set<String> workers = new HashSet<String>();
		workers.add("������");
		workers.add("�躸��");
		workers.add("������");
		workers.add("�̵���");
		workers.add("�̵���");
		System.out.println("---Set Test---");
		for (String string : workers) {
			System.out.println(string);
		}
		
		
		test1Sol.KBStudent k1 = new test1Sol.KBStudent("������","����",30,3);
		test1Sol.KBStudent k2 = new test1Sol.KBStudent("������","����",30,3);
		System.out.println(k1.equals(k2)); // ��ȣ�� �������� ���ϸ� ���ٰ� ����
		
		Set<KBStudent> kbstudents = new HashSet<KBStudent>();
		kbstudents.add(k1);
		kbstudents.add(k2);
		// �ߺ��� ���� �־��µ� �ߺ��� ������ ���� ��µȴ�
		// ---> ��� �ؾ��ϴ°�?
		// ---> hashCode �޼ҵ� �������̵� ---> equals �޼ҵ� �������̵�����
		for (KBStudent kbStudent : kbstudents) {
			System.out.println(kbStudent);
		}
		
	}
}
