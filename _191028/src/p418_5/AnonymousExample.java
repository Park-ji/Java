package p418_5;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run(); //필드값에서 선언해 돌리기
		anony.method1(); //메서드에서 선언해 돌리기
		anony.method2(new Vehicle() {//매개변수로 돌리기
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		}
		);
	}

}
