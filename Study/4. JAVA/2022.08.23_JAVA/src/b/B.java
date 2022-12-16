package b;
import  a.*;

public class B extends A{
	public static void main(String args[]) {
		// import 통해서 외부 패키지를 포함하면
		// 외부 클래스에 대한 객체 생성 가능
		B a = new B();
		
		a.pub = 1;
		// public 접근 가능
		//a.pri = 2;
		// private 접근 불가능
		a.pro = 3;
		// protected 접근 불가능
	
	}
}