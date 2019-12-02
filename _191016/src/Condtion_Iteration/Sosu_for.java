package Condtion_Iteration;

public class Sosu_for {
	public static void main(String[] args) {
		int num = 10;
		System.out.print(num+"의 약수 : ");
		for(int i =1;i<=num;i++) {
			if(num%i==0) System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.print(num+"까지 소수 : ");
		for(int i=2;i<=num;i++) {
			int cnt =0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) cnt++;
			}
			if(cnt==1) System.out.print(i+" ");
		}
	}

}
