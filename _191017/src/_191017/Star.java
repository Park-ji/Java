package _191017;

public class Star {
	public static void main(String[] args) {
		//1¹ø
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//2¹ø
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int i = 3; i > 0; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//3¹ø
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
