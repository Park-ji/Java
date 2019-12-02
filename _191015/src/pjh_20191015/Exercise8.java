package pjh_20191015;

public class Exercise8 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')||(ch<='A'&&ch>='Z')?true:false);
		System.out.println(b);
	}
}
