package Condtion_Iteration;

public class NumberBox {
	public static void main(String[] args) {
		int num=1;
		for(;;) {
			//System.out.print(num++ + " ");
			System.out.print(num++);
			if(num%5==1) {//6이 되는 순가 enter
				//System.out.println();
				System.out.print('\n');
			}
			else {
				System.out.print('\t');
			}
			if(num>25) break;
		}
	}

}
