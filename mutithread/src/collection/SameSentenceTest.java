package collection;

import java.util.ArrayList; //Ctrl+Shift+M


class SameSentence {
	void compare(ArrayList<String> first, ArrayList<String> second) {
		
		ArrayList<String> result = new ArrayList<String>();
		int size = (first.size()>=second.size()?second.size():first.size());
		
		for(int i=0;i<size;i++) {//string�� �񱳴� equals
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
		list1.add("�ڹٴ� ��ü���� ����Դϴ�");
		list1.add("�츮�� ŰƮ������ �ڹٸ� ���� ���Դϴ�");
		list1.add("������ �÷��� �����ӿ�ũ�� �����! ");
		list1.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("�ڹٴ� ��ü���� ����Դϴ�");
		list2.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
		list2.add("������ �ݷ��� �����ӿ�ũ�� �����! ");
		list2.add("������ ����°� ��Ʈ��ũ�� ��� �����Դϴ� ");

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("�ڹٴ� ��ü���� ����Դϴ�");
		list3.add("�츮�� kitri���� �ڹٸ� ���� ���Դϴ�");
		list3.add("������ �ݷ��� �����ӿ�ũ�� �����! ");

		SameSentence ss = new SameSentence();
		//ArrayList<String> result = new ArrayList<String>();
		ss.compare(list1, list2);
		// list1, list2�� ������ ������ ������ �� ����Ʈ���� ���� ���븸 ���Ϲ޾� ���
//		for(int i=0;i<result.size();i++) {
//			System.out.println(result.get(i));
//		}
		System.out.println("============================================");
		ss.compare(list1, list3);
		// list1, list3�� ������ ������ �ٸ��� ���� ũ���� ������ŭ�� ���Ͽ� ���� ���� ���Ϲ޾� ���
//		for(int i=0;i<result.size();i++) {
//			System.out.println(result.get(i));
//		}

	}
}
