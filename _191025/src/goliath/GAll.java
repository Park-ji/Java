package goliath;

public interface GAll extends GtoAir, GtoGround {
	//interface는 생성자가 없음!
	void upgrade();

}

interface GtoAir{
	public abstract void attackAir();
}

interface GtoGround{
	void attackGround();
	
}
