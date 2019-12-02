package packageB;

public class ClassB {
	ClassBB bb = new ClassBB();
	
	public int publicA;
	protected int protectedA;
	int defaulta;
	private int privateA;
}

class ClassBB {
}// default

//class는 public이랑 default만 있음
//메서드에서 private, protected... 접근제한자를 사용할 수 있음