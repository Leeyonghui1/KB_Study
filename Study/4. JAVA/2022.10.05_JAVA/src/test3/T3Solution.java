package test3;

public class T3Solution {

	public static void main(String[] args) {
		System.out.println("총 인원 : "+ GameChaSol.getCount());
		GameChaSol g1 = new GameChaSol();
		System.out.println("총 인원 : "+ GameChaSol.getCount());
		g1.set_Class("핑크전사");
		g1.setId("핑크퐁크재형");
		
		GameChaSol g2 = new GameChaSol("최강김혜민","야구마법사");
		System.out.println("총 인원 : "+ GameChaSol.getCount());
		GameChaSol g3 = new GameChaSol("최강김혜민","야구마법사");
		g3.set_Class("직훈교사");
		g3.setId("에러메시지좀보라고");
		g3.setLevel(34);
		System.out.println("총 인원 : "+ GameChaSol.getCount());
		
		GameChaSol.sayHello();
		// 직업에 따라서 다른 출력
		System.out.print(g1.getId()+"의 ");
		g1.attack();
		g2.attack();
		g3.attack();
		

	}

}
