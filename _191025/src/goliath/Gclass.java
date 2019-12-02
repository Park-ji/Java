package goliath;

public class Gclass extends GallAbstract{
	
	public static void main(String[] args) {
		Gclass goliath = new Gclass();
		goliath.attackAir();
		goliath.attackGround();
		goliath.upgrade();
		System.out.println("end");
	}
	@Override
	public void upgrade() {
		System.out.println("upgrade()");
	}

}
