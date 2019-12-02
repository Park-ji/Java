package referenceType;

public class StringExample {
	public static void main(String[] args) {
		String str = "yeo";
		//String은 왜 import를 안하나? 클래스 생성시, java.lang.*이  자동으로 import되어있음
		//구글에 'java doc'치고 상단에 있는거 클리식? java platform standard 문서
		//ctrl+F -> String 검색시  왼쪽의 All classes에서 자세한 설명을 볼수가 있음!
		String str2 = "yeo";
		
		
		if(str==str2){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String str3 = new String("yeo");
		//new를 선언하면 heap에 이미 저장된 내용이라도 다른 메모리 영역을 할당해줌
		if(str==str3){//논리연산자는 스택에 있는 내용을 비교 ==> 주소값이 다르므로
			System.out.println("true");
		}
		else {//flase가 출력
			System.out.println("false");
		}
		
		
		if(str.equals(str3)) {//메서도 사용
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
