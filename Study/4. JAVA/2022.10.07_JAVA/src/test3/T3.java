package test3;

public class T3 {

	public static void main(String[] args) {
		LeagueOfLegends Champ1 = new DrMundo();
		Champ1.setName("문도 박사");
		Champ1.setRuneterra("자운");
		
		LeagueOfLegends Champ2 = new Malphite();
		Champ2.setName("말파이트");
		Champ2.setRuneterra("거석");
		
		System.out.println("챔피언명 : "+Champ1.getName());
		System.out.println("소속 : "+Champ1.getRuneterra());
		Champ1.Q();
		Champ1.W();
		Champ1.E();
		Champ1.R();
		System.out.println();
		System.out.println("챔피언명 : "+Champ2.getName());
		System.out.println("소속 : "+Champ2.getRuneterra());
		Champ2.Q();
		Champ2.W();
		Champ2.E();
		Champ2.R();
		System.out.println();
		
		LeagueOfLegends Champ3 = new LeagueOfLegends() {
			@Override
			public void Q() {
				System.out.println("Q 스킬명 : 술통 굴리기");
			}
			@Override
			public void W() {
				System.out.println("W 스킬명 : 취중 분노");
			}
			@Override
			public void E() {
				System.out.println("E 스킬명 : 몸통 박치기");
			}
			@Override
			public void R() {
				System.out.println("R 스킬명 : 술통 폭발");
			}
		};
		Champ3.setName("그라가스");
		Champ3.setRuneterra("프렐요드");
		
		System.out.println("챔피언명 : "+Champ3.getName());
		System.out.println("소속 : "+Champ3.getRuneterra());
		Champ3.Q();
		Champ3.W();
		Champ3.E();
		Champ3.R();
	}
}
