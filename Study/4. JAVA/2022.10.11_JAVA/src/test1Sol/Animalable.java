package test1Sol;

public interface Animalable {
	public void charming();
	// default 쓰면 해당 메소드를 오버라이딩(구현)하지 않아도 오류발생하지 않음
	public default void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
