package referenceType;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		int[]  fibo = new int[10];
		//int tmp=0;
		int size = fibo.length-1;
		
		for(int i=0;i<fibo.length;i++) {
			if(i<=1) fibo[i] = 1;
			else {
				fibo[i] = fibo[i-1]+fibo[i-2];
			}
		}
		
		for(int i=0;i<fibo.length;i++) {
			System.out.print(fibo[i]+ " ");
		}
		
		for(int i=0;i<fibo.length/2;i++) {	
			int tmp = fibo[i];
			fibo[i] = fibo[size-i];
			fibo[size-i] = tmp;
		}
		
		System.out.println();
		for(int i=0;i<fibo.length;i++) {
			System.out.print(fibo[i]+ " ");
		}
		
		
	}

}
