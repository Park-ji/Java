package _191021;

public class ArrArrTest {
	public static void main(String[] args) {
		int[][] arr2 = new int[2][3];

		System.out.println("arr2[0]�� �ּ� : " + arr2);
		System.out.println("arr2[0][0]�� �ּ� : " + arr2[0]);
		System.out.println("arr2[1][0]�� �ּ� : " + arr2[1]+"\n");

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
		
		//arr4�� ���� �����ϸ�? ������� �迭�� ����� �ִ� (���� ���� ����̸� ������ ���簢������ ������ �ǿ��)
		int[][] arr4 = new int[2][];
		arr4[0] = new int[2]; //arr4�� 0��° �ּҿ� 3���� �޸� �Ҵ�(new��)
		arr4[1] = new int[4];
		
		arr4[0][0] = 10;
		arr4[0][1] = 20;
		arr4[1][0] = 30;
		arr4[1][1] = 40;
		arr4[1][2] = 50;
		arr4[1][3] = 60;				
		
		//���� ���� �迭��  ����Ҷ�? length�� ���ϸ� ��(�׳� for���̸� x)
		System.out.println();
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
