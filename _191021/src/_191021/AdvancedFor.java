package _191021;

public class AdvancedFor {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int value : arr) { //arr�� �ִ� element�� value�� ����
			System.out.print(value);
		}
		
		System.out.println();
		
		for(int[] tmpArr : arr2) { //arr2 : arr2[0]�� �ּҰ��̹Ƿ� --> �־��ִ� value�� tmpArr�� �迭�� �����! 
			//�ӵ��� �Ȱ���!!
			for(int value : tmpArr)
				System.out.print(value);
			System.out.println();		
		}
	}

}
