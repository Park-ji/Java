package referenceType;

public class ArrExample {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
		
		
		//new를 만나면 heap 새로운 객체를 만듦
		//배열에 1,2,3,4,5,6를 넣겠다고 항목을 정하였기 때문에
		//int[] 안에 아무것도 안써줘도 정한 내용에 따라 6개 할당됨
		//대입연산자에 의해서 새롭게 만들어진 내용을 가르킴
		
		//원래 있는 내용은 garbage값 
		//java의 gc(garbage collector)가 아무것도 가르키고 있지 않은 데이터는 알아서 삭제해줌
		//메모리 다운 방지
		arr = new int[] {1,2,3,4,5,6};
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);
		//배열 갯수 확인? arr에 할당된 함수 -> length
		
		System.out.println(arr.length);//Array의 개수를 뽑아줌
		
	}
}
