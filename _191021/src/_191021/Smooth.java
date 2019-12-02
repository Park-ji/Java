package _191021;

public class Smooth {
	
	double[][] Move(int istart, int jstart, double[][] arr, double avg) {
		for (int i = istart; i < istart + 3; i++) {
			for (int j = jstart; j < jstart + 3; j++) {
				arr[i][j] = avg;
			}
		}
		return arr;
	}
	
	double Sum(int istart, int jstart, double[][] arr) {
		double sum = 0;
		for(int i=istart;i<istart+3;i++) {
			for(int j=jstart;j<jstart+3;j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	 double[][] Smoothing(int istart, int jstart, double[][] arr) {
		double sum = 0;
		double avg = 0.0;
		sum = Sum(istart,jstart, arr);
		avg = sum / 9;
		arr = Move(istart, jstart, arr, avg);
		jstart++;
		
		if (jstart >= 3) {
			jstart = 0; istart++;
			if (istart >= 3) return arr;
		} return Smoothing(istart, jstart, arr);

	}

	void PrintArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((Math.round(arr[i][j] * 100) / 100.0) + "\t");
			}
			System.out.println();
		}
	}

}
