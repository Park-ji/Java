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
		
		
		//new�� ������ heap ���ο� ��ü�� ����
		//�迭�� 1,2,3,4,5,6�� �ְڴٰ� �׸��� ���Ͽ��� ������
		//int[] �ȿ� �ƹ��͵� �Ƚ��൵ ���� ���뿡 ���� 6�� �Ҵ��
		//���Կ����ڿ� ���ؼ� ���Ӱ� ������� ������ ����Ŵ
		
		//���� �ִ� ������ garbage�� 
		//java�� gc(garbage collector)�� �ƹ��͵� ����Ű�� ���� ���� �����ʹ� �˾Ƽ� ��������
		//�޸� �ٿ� ����
		arr = new int[] {1,2,3,4,5,6};
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);
		//�迭 ���� Ȯ��? arr�� �Ҵ�� �Լ� -> length
		
		System.out.println(arr.length);//Array�� ������ �̾���
		
	}
}
