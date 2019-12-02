package HW_9ÀÏÂ÷;

class Outer {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(new Outer().new Inner().value);
			System.out.println(new Outer().value);
			
		}
	} // Inner
} // Outer

class Exercise4 {
	public static void main(String args[]) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
	} // main
}