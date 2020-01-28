package collection;

import java.util.HashSet;

public class LottoSetTest {
//6개 숫자 생성 set 내부 저장
//범위 : 1~45 , 숫자 중복 불허

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		// 0.0<=Math.random()<1.0
		// 0.0<=Math.random()*45<45.0
		// 0<=(int)(Math.random()*45)<45

//		for (int i = 0; i < 6; i++) {
//			Integer su = (int) ((Math.random() * 45) + 1);
//			System.out.println(su);
//			lotto.add(su); //중복된 값은 저장 x
//		}
		//이렇게 하면 6개가 생성되지 않을 수 있음
		
		
		//따라서 다음과 같이 반복문 실행
		while(lotto.size()<6) { 
			int num = (int)(Math.random() * 45) + 1;
			System.out.println(num);
			lotto.add(num);
		}
		
		System.out.println("---------------------------");
		for(Integer i : lotto) {
			System.out.print(i+" ");
		}
		


	}

}
