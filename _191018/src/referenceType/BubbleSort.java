package referenceType;



public class BubbleSort {
	
	
	
	public static void main(String[] args) {
		int[] BS = new int[] { 2, 5, 7, 1 };

		int tmp = 0;
		// int size = BS.length;
		
		System.out.print("정렬 전 : ");
		for(int i=0;i<BS.length;i++) {
			System.out.print(BS[i]+" ");
		}
		System.out.println("\n");
		

		for (int size = 0; size < BS.length; size++) {
			for (int i = 0; i < BS.length - 1; i++) {
				if (BS[i] > BS[i + 1]) {
					tmp = BS[i];
					BS[i] = BS[i + 1];
					BS[i + 1] = tmp;

				}				
			}
			
			System.out.print("정렬 "+(size+1)+"번째 : ");
			for(int i=0;i<BS.length;i++) {
				System.out.print(BS[i]+" ");
			}
			System.out.println();
		}
		
		System.out.print("\n정렬 후 : ");
		
		for(int i=0;i<BS.length;i++) {
			System.out.print(BS[i]+" ");
		}
		

	}

}
