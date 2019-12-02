package _191017;

public class Lotto {
	public static void main(String[] args) {

		int Lotto[] = new int[3];
		
		
		for(int i=0;i<Lotto.length;i++) {
			Lotto[i] = (int)(Math.random()*5)+1;
			for(int j=0;j<i;j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<Lotto.length;i++) {
			System.out.print(Lotto[i]+" ");
		}
		
		System.out.println();
		int num1,num2,num3;
		do {
			num1 = (int)(Math.random()*5)+1;
			num2 = (int)(Math.random()*5)+1;
			num3 = (int)(Math.random()*5)+1;
		}while(!(num1!=num2&&num2!=num3&&num3!=num1));
		System.out.println(num1+" "+num2+" "+num3);
		
	}

}
