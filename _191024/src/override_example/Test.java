package override_example;

public class Test {
	
	@Override
	public String toString() { //기존에 있는 함수를 오버라이딩
		System.out.println(super.toString());//Object.toString()이 호출~
		return "Test";
	}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.toString());
	}

}
