package _191021;

public class Smooth_AI {

//	public static double[][] Move(int l, int k, double[][] arr, double avg) {
//
//		for(int i=l; i<l+3;i++) {
//			for(int j=k;j<k+3;j++) {
//				arr[i][j] = avg;
//			}
//		}
//		
//		return arr;
//	}
//
//	public static void Smoothing(int l, int k, double[][] arr) {
//		int len = arr.length;
//		int sum = 0;
//		double avg = 0.0;
//		for (int i = l; i < l+3; i++) {
//			for (int j = k; j < k+3; j++) {
//				sum += arr[i][j];
//			}
//		}
//		avg = sum / 9.0;
//		arr = Move(l,k,arr, avg);
//	}

	public static void PrintArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((Math.round(arr[i][j]*100)/100.0) + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		double[][] smooth = new double[5][5];
		int num = 1;
		double sum =0;
		double avg = 0.0;
		for(int i=0;i<smooth.length;++i) {
			for(int j=0;j<smooth[i].length;++j) {
				smooth[i][j] = num++;
			}
		}
			
		//PrintArray(smooth);
		//Smoothing(smooth);
		for (int l = 0; l < 3; l++) {
			for (int k = 0; k < 3; k++) {
				//Smoothing(l, k, smooth);
				sum = 0;
				avg = 0.0;
				for (int i = l; i < l+3; i++) {
					for (int j = k; j < k+3; j++) {
						sum += smooth[i][j];
					}					
				}
				//System.out.println(sum);
				avg = (double) sum / 9;
				//System.out.println(avg);
				
				for (int m = l; m < l+3; m++) {
					for (int n = k; n < k+3; n++) {
						smooth[m][n] = avg;
					}
				}
				//PrintArray(smooth);
			}
		}
		
		PrintArray(smooth);

	}

}
