package HW_12����;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		//1. split() �޼ҵ� �̿�
		String[] str_split = str.split(",");
		for(String s : str_split)  System.out.println(s);
		System.out.println();
		
		//2. StringTokenizer �޼ҵ� �̿�
		StringTokenizer st = new StringTokenizer(str,",");
		//2-1
//		int cnt = st.countTokens(); //������ �ʰ� �����ִ� ��ū�� �� 
//		for(int i=0;i<cnt;i++) {
//			String token = st.nextToken(); //��ū�� �ϳ��� ������
//			System.out.println(token);
//		}
		//2-2
		while(st.hasMoreTokens()) {//���� �ִ� ��ū�� �ִ��� ����
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
