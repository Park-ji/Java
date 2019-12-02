package referenceType;

public class ArrayLotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int sum = 0;
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*7)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i]+" ");
			sum += lotto[i];
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();
		sum=0;
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+ " ");
			sum +=lotto[i];
		}
		System.out.println("\n"+sum);
	}
}
