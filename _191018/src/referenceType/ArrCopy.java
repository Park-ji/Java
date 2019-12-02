package referenceType;

public class ArrCopy {
	public static void main(String[] args) {
		int[] oldArr = new int[5];
		int[] newArr = new int[5];
		oldArr = new int[] { 1, 2, 3, 4, 5 };
		
		//1. 내가 만든 함수 이용
		//ArrCopy(oldArr, newArr); //값을 넘기는 것이 아니라 주소값을 넘김 : call-by-reference
		
		//2. 내장된 함수 이용
		//System.arraycopy(oldArr, 2, newArr, 2, 3);//마지막 의미? 몇개 복사할 것인지 정함
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














