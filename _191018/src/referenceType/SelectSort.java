package referenceType;

public class SelectSort {
	
	public static void main(String[] args) {
		int[] SS = new int[] {1,5,3,8,2};
		int maxIdx =0;
		int maxPos=0;
		
		for(int i = 0; i<SS.length-1;i++) {
			maxPos = i;
			for(int j = i+1; j<SS.length;j++) {
				if(SS[maxPos]<SS[j]) maxPos = j;
			}
			int tmp = SS[maxPos];
			SS[maxPos] = SS[i];
			SS[i] = tmp;
		}
		
		
//		for(int i=0;i<SS.length;i++) {
//			int max = 0;
//			for(int j=i;j<SS.length;j++) {
//				if(SS[j]>max) {
//					max = SS[j];
//					maxIdx = j;
//				}
//			}
//			int tmp = SS[i];
//			SS[i] = SS[maxIdx];
//			SS[maxIdx] = tmp;			
//		}
		
		for(int i=0;i<SS.length;i++) {
			System.out.print(SS[i]+" ");
		}
	}

}
