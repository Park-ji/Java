package goliath;

abstract class GallAbstract implements GtoAir, GtoGround {
	//abstract class도 추상메서드를 가질수 있기때문에 인터페이스에 있는 함수를 정의하지 않아도 에러가 뜨지 않음~
	
	public abstract void upgrade();
	//Gclass에서 다 구현할꺼면 너무 과부화이므로~
	@Override
	public void attackGround() {
		System.out.println("attackGround()");
	}
	@Override
	public void attackAir() {
		System.out.println("attackAir()");
	}
	

}
