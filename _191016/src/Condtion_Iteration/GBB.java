package Condtion_Iteration;

public class GBB {
	public static void main(String[] args) {
		// 가위:0,바위:1,보:2	
		int my = (int) (Math.random() * 3);
		int com = (int) (Math.random() * 3);
		
		System.out.println("나 : " + my);
		System.out.println("컴퓨터 : " + com);
		
		//선생님 풀이: (my-com+2)%3 -> 0: 내가 이김/ 1: 컴퓨터가 이김
		switch(my-com) {
		case 1:
		case -2: System.out.println("내가 이겼습니다."); break;
		case -1:
		case 2: System.out.println("내가 졌습니다."); break;
		case 0: System.out.println("내가 비겼습니다."); break;			
		}
		
//		switch (com) {
//		case 0:
//			if (my == 0)
//				System.out.println("비겼습니다.");
//			else if (my == 1)
//				System.out.println("내가 이겼습니다.");
//			else
//				System.out.println("내가 졌습니다.");
//			break;
//		case 1:
//			if (my == 0)
//				System.out.println("내가 졌습니다.");
//			else if (my == 1)
//				System.out.println("비겼습니다.");
//			else
//				System.out.println("내가 이겼습니다.");
//			break;
//		default:
//			if (my == 0)
//				System.out.println("내가 이겼습니다.");
//			else if (my == 1)
//				System.out.println("내가 졌습니다.");
//			else
//				System.out.println("비겼습니다.");
//		}
	}
}
