package _191021;

//Math.round()함수 사용 : double형 소수점 자르기
public class Smooth_AI_Final {

	public static void main(String[] args) {
		Smooth s = new Smooth();
		int istart=0, jstart=0;
		double[][] smooth = new double[5][5];
		int num = 1;
		for (int i = 0; i < smooth.length; ++i) {
			for (int j = 0; j < smooth[i].length; ++j) {
				smooth[i][j] = num++;
			}
		}
		s.PrintArray(s.Smoothing(istart, jstart, smooth));
	}
}
