package collection;

import java.util.HashSet;

public class LottoSetTest {
//6�� ���� ���� set ���� ����
//���� : 1~45 , ���� �ߺ� ����

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		// 0.0<=Math.random()<1.0
		// 0.0<=Math.random()*45<45.0
		// 0<=(int)(Math.random()*45)<45

//		for (int i = 0; i < 6; i++) {
//			Integer su = (int) ((Math.random() * 45) + 1);
//			System.out.println(su);
//			lotto.add(su); //�ߺ��� ���� ���� x
//		}
		//�̷��� �ϸ� 6���� �������� ���� �� ����
		
		
		//���� ������ ���� �ݺ��� ����
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
