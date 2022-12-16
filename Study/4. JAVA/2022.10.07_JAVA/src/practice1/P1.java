package practice1;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		
		// 추상클래스타입으로 인스턴스 생성 불가
		// Food f = new Food();  :: 오류
		
		Food f = new Taco();
		Ramen r = new Ramen();
		Bibimbab b = new Bibimbab();
		
		f.eat();
		r.eat();
		b.eat();
		System.out.println("--------------");
		
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(f);
		foods.add(r);
		foods.add(b);
		// foods에 있는 음식들 모두 eat 호출가능
		// eat이 각각 다르게 구현
		for (Food food : foods) {
			food.eat();
		}
		
		
		// 익명클래스 :: 이름이 아예없는 클래스
		// temp에서만 쓰이는 클래스
		Food temp = new Food() {
			public void eat() {
				System.out.println("기도하고 먹는다");
			}
		};
		temp.setName("교회식당밥");
		foods.add(temp);
		
		foods.add(new Food() {
			@Override
			public void eat() {
				System.out.println("묵상하고 먹는다");
			}
		});
		
		
	}
}
