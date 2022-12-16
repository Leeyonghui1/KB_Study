package test2Sol;

import java.util.ArrayList;
import java.util.List;

public class T2Solution {

	public static void main(String[] args) {
		List<Cryptid> fantasies = new ArrayList<Cryptid>();
		fantasies.add(new Dragon());
		fantasies.add(new Unicorn());
		fantasies.add(new Cryptid() {
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				super.sleep();
			}
		});
	}

}
