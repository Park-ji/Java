package referenceType;

public class StringExample {
	public static void main(String[] args) {
		String str = "yeo";
		//String�� �� import�� ���ϳ�? Ŭ���� ������, java.lang.*��  �ڵ����� import�Ǿ�����
		//���ۿ� 'java doc'ġ�� ��ܿ� �ִ°� Ŭ����? java platform standard ����
		//ctrl+F -> String �˻���  ������ All classes���� �ڼ��� ������ ������ ����!
		String str2 = "yeo";
		
		
		if(str==str2){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String str3 = new String("yeo");
		//new�� �����ϸ� heap�� �̹� ����� �����̶� �ٸ� �޸� ������ �Ҵ�����
		if(str==str3){//�������ڴ� ���ÿ� �ִ� ������ �� ==> �ּҰ��� �ٸ��Ƿ�
			System.out.println("true");
		}
		else {//flase�� ���
			System.out.println("false");
		}
		
		
		if(str.equals(str3)) {//�޼��� ���
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
