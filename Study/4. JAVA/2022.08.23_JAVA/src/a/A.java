package a;

public class A {
	// 접근 제어자 : private, public, protected
	private int pri;
	// private : 자기 자신의 클래스 안에서만 접근 가능
	public int pub;
	// public : 본인 클래스 이외의 외부에서도 접근 가능
	protected int pro;
	/* protected 접근 가능 범위
	 * 클래스 자기 자신(클래스 A)과 해당 클래스가 속한 패키지(package a)
	 * 자신의 클래스를 상속받은 클래스
	 */
	
	public void setPri(int pri) {this.pri=pri;}
	public int getPri() {return this.pri;}
}
