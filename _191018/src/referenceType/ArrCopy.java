package referenceType;

public class ArrCopy {
	public static void main(String[] args) {
		int[] oldArr = new int[5];
		int[] newArr = new int[5];
		oldArr = new int[] { 1, 2, 3, 4, 5 };
		
		//1. ���� ���� �Լ� �̿�
		//ArrCopy(oldArr, newArr); //���� �ѱ�� ���� �ƴ϶� �ּҰ��� �ѱ� : call-by-reference
		
		//2. ����� �Լ� �̿�
		//System.arraycopy(oldArr, 2, newArr, 2, 3);//������ �ǹ�? � ������ ������ ����
		myArrayCopy(oldArr,2,newArr,2,3);
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+ " ");			
		}

		
		
//		for (int i = 0; i < newArr.length; i++) {
//			newArr[i] = oldArr[i];
//		}
	}
	
	public static void ArrCopy(int[] Arr1, int[] Arr2) {
		for(int i=0;i<Arr2.length;i++) {
			Arr2[i] = Arr1[i];
		} 
		return;
	}
	
	public static void myArrayCopy(int[] Arr1, int n1, int[] Arr2, int n2, int n3) {
		for(int i=0;i<n3;i++) {
			Arr2[n2] = Arr1[n1];
			n1++;
			n2++;
		}
	}

}














