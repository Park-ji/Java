package _191021;

public class CalArr {
	public static void CalArray(int[][] arr1, int[][] arr2, int[][] arr3, int c) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				switch (c) {
				case 1: //addArr
					arr3[i][j] = arr1[i][j] + arr2[i][j];
					break;
				case 2://minuArr
					arr3[i][j] = arr1[i][j] - arr2[i][j];
					break;
				case 3://muxArr
					//¼±»ı´Ô Ç®ÀÌ
//					for(int i=0;i<arr1.length;i++) {
//						for(int j=0;j<arr2[i].length;j++) {
//							arr3[i][j] = (arr1[i][0]*arr2[0][j]+arr1[i][1] * arr2[1][j]);
//						}
//					}
					int sum = 0;
					for (int k = 0; k < arr1[i].length; k++) {
						sum += arr1[i][k] * arr2[k][j];
					}
					arr3[i][j] = sum;
					break;
				}
			}
		}
		PrintArray(arr3);
	}

	public static void PrintArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		int[][] arr3 = new int[2][2];

		int num1 = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num1;
				arr2[i][j] = num1 + 4;
				num1++;
			}
		}
		
		CalArray(arr1, arr2, arr3, 3);

	}
}
