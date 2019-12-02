package HW;

public class Exercise9 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp=number;
		int result =0; //변수 number를 거꾸로 변환해서 담을 변수
		//int cnt =0;
		
		while(tmp!=0) {
			result = result*10 + tmp%10;
			//System.out.println(result);
			tmp/=10;
		}
		
		
//		while(tmp!=0) {
//			tmp/=10;
//			cnt++;
//		}
//		
//		tmp = number;
//		
//		while(cnt>0) {
//			result += (tmp%10) * (int)(Math.pow(10,cnt-1));
//			tmp/=10;
//			cnt--;
//		}
//			
		if(number==result)
			System.out.println(number+"는 회문수 입니다.");
		else
			System.out.println(number+"는 회문수가 아닙니다.");
	}

}
