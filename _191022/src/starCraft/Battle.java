package starCraft;

public class Battle {
	public static void main(String[] args) {		
		SCV scv1 = new SCV();
		SCV scv2 = new SCV();
		
		//scv1.move(2, 3);
		scv1.attack(scv2);
		System.out.println("scv2 hp = "+scv2.hp);
		
		scv1.refair(scv2);
		System.out.println("scv2 hp = "+scv2.hp);
	}

}
