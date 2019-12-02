package _191021;

public class ArrArrTest {
	public static void main(String[] args) {
		int[][] arr2 = new int[2][3];

		System.out.println("arr2[0]의 주소 : " + arr2);
		System.out.println("arr2[0][0]의 주소 : " + arr2[0]);
		System.out.println("arr2[1][0]의 주소 : " + arr2[1]+"\n");

		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}

		int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		//arr4와 같이 선언하면? 찌끄러진 배열도 만들수 있다 (위와 같은 방법이면 무조건 직사각형으로 선언이 되요ㅠ)
		int[][] arr4 = new int[2][];
		arr4[0] = new int[2]; //arr4의 0번째 주소에 3개의 메모리 할당(new로)
		arr4[1] = new int[4];
		
		arr4[0][0] = 10;
		arr4[0][1] = 20;
		arr4[1][0] = 30;
		arr4[1][1] = 40;
		arr4[1][2] = 50;
		arr4[1][3] = 60;				
		
		//위와 같은 배열을  출력할때? length를 구하면 됨(그냥 for문이면 x)
		System.out.println();
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
