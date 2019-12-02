package _191017;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 출력");
//		for(int i=2;i<=7;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.print(i+"*"+j+"="+(i*j)+"\t");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=7;j++) {
				if(j-1==i) {
					System.out.print("\t");
					//continue;
					}
				else
				System.out.print(j+"*"+i+"="+(j*i)+"\t");				
			}
			System.out.println();
		}
	}

}
