package collection;

import java.util.HashMap;
import java.util.Set;

//��ȭ��ȣ��
public class HashMapTest {
	public static void main(String[] args) {
		/* ���л� : {"�޴���", "��", "�繫��", "�̸���"}
		 * Map ���� ���� (key = �̸�, value = ������) 
		 * �̸� = String, ������ = String[]*/
		//�迭 : 
		String[] phone1 = {"01022223333","026253456","0311234567","kim@kitri.com"};
		String[] phone2 = {"01045678900","05145678911"};
		String[] phone3 = {"01012345678","05145678911","05100009999"};
		String[] phone4 = {"01056789456"};
		
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		map.put("���л�",phone1);
		//map.put("���л�", new String[]{"01022223333","026253456","0311234567","kim@kitri.com"});
		map.put("���л�", phone2);
		map.put("���л�",phone3);
		map.put("���л�", phone4);
		map.put("���л�", phone1); //����===>��, key���� �ߺ��ɼ� ����
		
		//map.get(key) ==> string[] Ÿ����
//		String[] result = map.get("���л�");
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//			
//		}
		//map ���� ��� Ű ��ȸ
//		Set<String> keynames = map.keySet();
//		for(String str : keynames) {
//			String[] result2 = map.get(str);
//			System.out.println(str + "�� ��ȭ��ȣ�� ������ �����ϴ�.");
//			for(int i=0;i<result2.length;i++) {
//				System.out.println(result2[i]);
//			}
//		}
//		
		
//		for(String str : map.keySet()) {
//			System.out.println(str+"�� ��ȭ��ȣ�� ������ �����ϴ�.");
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
