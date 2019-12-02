package pjh_20191015;

public class Exercise9 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = (ch>='A'&&ch<='Z'?(char)(ch+32):ch);
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
	}

}
