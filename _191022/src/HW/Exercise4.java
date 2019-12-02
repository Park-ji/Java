package HW;

public class Exercise4 {
	
	static boolean isNumber(String str) {
		int len = str.length();
		boolean ret = true;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') ret = true;
			else ret = false;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

}
