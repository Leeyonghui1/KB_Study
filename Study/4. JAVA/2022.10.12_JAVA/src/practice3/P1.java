package practice3;

import java.util.*;
import test1Sol.KBStudent;

public class P1 {

	public static void main(String[] args) {
		// Java에는 크게 List, Set, Map 3가지로 구분
		
		// List에 ArrayList말고도 다양한 종류가 있음
		/*
		List<Integer> ex1 = new ArrayList<Integer>();
		List<Integer> ex2 = new LinkedList<Integer>();
		List<Integer> ex3 = new Stack<Integer>();
		List<Integer> ex4 = new Vector<Integer>();
		Queue<Integer> ex5 = new LinkedList<Integer>();
		*/
		// Map, Set
		// C#의 dictionary, python dict랑 같은것
		// Map에서 대표적인것은 HashMap
		// Hash :: 각 데이터를 구분하는 고유값(혹은 고유코드)
		// 요약
		// Map :: 키 값과 데이터 값을 저장 관리하고 키 값이 중복되면 기존 데이터 값 삭제
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "안서준");
		students.put(2, "이동준");
		students.put(1, "박지호"); // 키 값이 겹치므로 이전 값 덮어씀
		students.put(3, "박지호"); // 데이터 값이 같아도 키 값이 다르면 다른 데이터
		for(int key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		// Set :: 중복을 허용하지 않는 리스트, 순서가 없음(먼저 들어간 데이터가 나중에 출력되기도 함)
		Set<String> workers = new HashSet<String>();
		workers.add("김진규");
		workers.add("김보규");
		workers.add("김진규");
		workers.add("이동준");
		workers.add("이동준");
		System.out.println("---Set Test---");
		for (String string : workers) {
			System.out.println(string);
		}
		
		
		test1Sol.KBStudent k1 = new test1Sol.KBStudent("이현민","남성",30,3);
		test1Sol.KBStudent k2 = new test1Sol.KBStudent("이현민","남성",30,3);
		System.out.println(k1.equals(k2)); // 번호를 기준으로 비교하면 같다고 나옴
		
		Set<KBStudent> kbstudents = new HashSet<KBStudent>();
		kbstudents.add(k1);
		kbstudents.add(k2);
		// 중복된 값을 넣었는데 중복된 값들이 각각 출력된다
		// ---> 어떻게 해야하는가?
		// ---> hashCode 메소드 오버라이딩 ---> equals 메소드 오버라이딩까지
		for (KBStudent kbStudent : kbstudents) {
			System.out.println(kbStudent);
		}
		
	}
}
