package HW_12일차;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		//1. split() 메소드 이용
		String[] str_split = str.split(",");
		for(String s : str_split)  System.out.println(s);
		System.out.println();
		
		//2. StringTokenizer 메소드 이용
		StringTokenizer st = new StringTokenizer(str,",");
		//2-1
//		int cnt = st.countTokens(); //꺼내지 않고 남아있는 토큰의 수 
//		for(int i=0;i<cnt;i++) {
//			String token = st.nextToken(); //토큰을 하나씩 꺼내옴
//			System.out.println(token);
//		}
		//2-2
		while(st.hasMoreTokens()) {//남아 있는 토큰이 있는지 여부
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
