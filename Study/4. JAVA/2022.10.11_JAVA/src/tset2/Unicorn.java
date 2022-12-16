package tset2;

public class Unicorn extends Animal implements Fliable, Runsable {

	@Override
	public void Run() {
		System.out.println(getName()+"의 달리기 다그닥");
	}

	@Override
	public void Jog() {
		System.out.println(getName()+"의 모델 워킹 사뿐사뿐");
	}

	@Override
	public void Fly() {
		System.out.println(getName()+"의 화려한 비행실력 휘이잉~");
	}

	@Override
	public void FlapWing() {
		System.out.println(getName()+"의 요란한 날갯짓 푸드덕");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"은 쿨쿨~~");
	}
	
	public void printInfo() {
		System.out.println("유니콘의 정보");
		System.out.println("이름 : "+ getName());
		System.out.println("나이 : "+ getAge()+"살");
	}

}
