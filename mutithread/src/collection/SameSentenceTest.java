package collection;

import java.util.ArrayList; //Ctrl+Shift+M


class SameSentence {
	void compare(ArrayList<String> first, ArrayList<String> second) {
		
		ArrayList<String> result = new ArrayList<String>();
		int size = (first.size()>=second.size()?second.size():first.size());
		
		for(int i=0;i<size;i++) {//string값 비교는 equals
			if(first.get(i).equals(second.get(i)))
				result.add(first.get(i));
		}
		
		for(int i=0;i<result.size();i++)
		System.out.println(result.get(i));
		
		//return result;
	}
}

public class SameSentenceTest {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("자바는 객체지향 언어입니다");
		list1.add("우리는 키트리에서 자바를 배우는 중입니다");
		list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("자바는 객체지향 언어입니다");
		list2.add("우리는 kitri에서 자바를 배우는 중입니다");
		list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
		list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("자바는 객체지향 언어입니다");
		list3.add("우리는 kitri에서 자바를 배우는 중입니다");
		list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");

		SameSentence ss = new SameSentence();
		//ArrayList<String> result = new ArrayList<String>();
		ss.compare(list1, list2);
		// list1, list2의 데이터 갯수가 같으면 두 리스트에서 같은 내용만 리턴받아 출력
//		for(int i=0;i<result.size();i++) {
//			System.out.println(result.get(i));
//		}
		System.out.println("============================================");
		ss.compare(list1, list3);
		// list1, list3의 데이터 갯수가 다르면 작은 크기의 갯수만큼만 비교하여 같은 내용 리턴받아 출력
//		for(int i=0;i<result.size();i++) {
//			System.out.println(result.get(i));
//		}

	}
}
