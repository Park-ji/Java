package Condtion_Iteration;

public class GBB {
	public static void main(String[] args) {
		// ����:0,����:1,��:2	
		int my = (int) (Math.random() * 3);
		int com = (int) (Math.random() * 3);
		
		System.out.println("�� : " + my);
		System.out.println("��ǻ�� : " + com);
		
		//������ Ǯ��: (my-com+2)%3 -> 0: ���� �̱�/ 1: ��ǻ�Ͱ� �̱�
		switch(my-com) {
		case 1:
		case -2: System.out.println("���� �̰���ϴ�."); break;
		case -1:
		case 2: System.out.println("���� �����ϴ�."); break;
		case 0: System.out.println("���� �����ϴ�."); break;			
		}
		
//		switch (com) {
//		case 0:
//			if (my == 0)
//				System.out.println("�����ϴ�.");
//			else if (my == 1)
//				System.out.println("���� �̰���ϴ�.");
//			else
//				System.out.println("���� �����ϴ�.");
//			break;
//		case 1:
//			if (my == 0)
//				System.out.println("���� �����ϴ�.");
//			else if (my == 1)
//				System.out.println("�����ϴ�.");
//			else
//				System.out.println("���� �̰���ϴ�.");
//			break;
//		default:
//			if (my == 0)
//				System.out.println("���� �̰���ϴ�.");
//			else if (my == 1)
//				System.out.println("���� �����ϴ�.");
//			else
//				System.out.println("�����ϴ�.");
//		}
	}
}
