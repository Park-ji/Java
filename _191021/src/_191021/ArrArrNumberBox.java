package _191021;

public class ArrArrNumberBox {
	
	public static void printArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		return;
	}
	
	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

// 1.
//		for (int i = 0; i < arr.length; i++) {
//			if (i % 2 == 0) {
//				for (int j = 0; j < arr[i].length; j++) {
//					arr[i][j] = 5 * i + (j + 1);
//				}
//			} else {
//				for (int j = arr[i].length - 1; j >= 0; j--) {
//					arr[i][j] = 5 * (i + 1) - j;
//				}
//			}
//		}
//		
// 2.
//		int num = 1;
//		for(int i=0;i<arr.length;i++) {
//			if(i%2 ==0) {
//				for(int j=0;j<arr[i].length;j++) {
//					arr[i][j]=num;
//					num++;
//				}
//			}
//			else {
//				for(int j=arr[i].length-1;j>=0;j--) {
//					arr[i][j] = num;
//					num++;
//				}
//			}
//		}
// 3.		
//		int x=1;
//		int num = 0;
//			
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = 5*num+x;
//				if(i%2==0) x++;
//				else x--;				
//			}
//			if(i%2==0)x--;
//			else x++;
//			num++;
//		}
		
//4.
		int num = 0;
		int x = 1;
		int len = arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				num = num+x;
				arr[i][j] = num;
			}
			num = num + x + len;
			x = x*-1;
		}


		printArray(arr);
	}

}
