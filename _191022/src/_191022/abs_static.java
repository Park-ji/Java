package _191022;

public class abs_static {

	public static void main(String[] args) {
		System.out.println(MathExam.abs(-2.0f));
	}

}

class MathExam{
	static int abs(int a) {
		if(a<0) return -a;
		else return a;
		//return ((a<0)?-a:a);
	}
	static double abs(double a) {
		if(a<0) return -a;
		else return a;
	}
	
	static float abs(float a) {
		if(a<0) return -a;
		else return a;
	}
	
	static short abs(short a) {
		if(a<0) return (short) -a;
		else return a;
	}
	
	static long abs(long a) {
		if(a<0) return -a;
		else return a;
	}
	
	static byte abs(byte a) {
		if(a<0) return (byte)-a;
		else return a;
	}
	
}
