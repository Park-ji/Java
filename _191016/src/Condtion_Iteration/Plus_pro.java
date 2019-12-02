package Condtion_Iteration;

public class Plus_pro {

	public static void main(String[] args) {
		
		int val[][] = new int[5][5];
		int num = 0; //넣을 값
		int cnt = val.length;//반복횟수
		int sw = 1;//스위치 변수(1,-1)
		int r = 0, c = -1; // row(행), column(열)
		
		while(true) {
			for(int i=0;i<cnt;i++){
				num++;
				c = c+sw;
				val[r][c] = num;
			}
			cnt--;
			if(cnt>0) {
				for(int i=0;i<cnt;i++) {
					num++;
					r = r+sw;
					val[r][c]=num;
				}
				sw = sw* (-1);
				
			}
			else break;
		}
		
		for(int i=0;i<val.length;i++) {
			for(int j=0;j<val.length;j++) {
				System.out.print(val[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
