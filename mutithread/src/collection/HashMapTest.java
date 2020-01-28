package collection;

import java.util.HashMap;
import java.util.Set;

//전화번호부
public class HashMapTest {
	public static void main(String[] args) {
		/* 김학생 : {"휴대폰", "집", "사무실", "이메일"}
		 * Map 저장 형태 (key = 이름, value = 폰정보) 
		 * 이름 = String, 폰정보 = String[]*/
		//배열 : 
		String[] phone1 = {"01022223333","026253456","0311234567","kim@kitri.com"};
		String[] phone2 = {"01045678900","05145678911"};
		String[] phone3 = {"01012345678","05145678911","05100009999"};
		String[] phone4 = {"01056789456"};
		
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		map.put("김학생",phone1);
		//map.put("김학생", new String[]{"01022223333","026253456","0311234567","kim@kitri.com"});
		map.put("이학생", phone2);
		map.put("최학생",phone3);
		map.put("박학생", phone4);
		map.put("박학생", phone1); //수정===>즉, key값은 중복될수 없음
		
		//map.get(key) ==> string[] 타입임
//		String[] result = map.get("김학생");
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//			
//		}
		//map 내부 모든 키 조회
//		Set<String> keynames = map.keySet();
//		for(String str : keynames) {
//			String[] result2 = map.get(str);
//			System.out.println(str + "의 전화번호는 다음과 같습니다.");
//			for(int i=0;i<result2.length;i++) {
//				System.out.println(result2[i]);
//			}
//		}
//		
		
//		for(String str : map.keySet()) {
//			System.out.println(str+"의 전화번호는 다음과 같습니다.");
//			for(int i =0; i< map.get(str).length;i++) {
//				System.out.println(map.get(str)[i]);
//			}
//			System.out.println();
//
//		}
//		
		
		for(String str : map.keySet()) {
			System.out.println(str);
			for(String i : map.get(str)) System.out.println(i);
			System.out.println();
		}		
		
	}

}
