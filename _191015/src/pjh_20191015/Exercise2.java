package pjh_20191015;

public class Exercise2 {
	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = ((numOfApples/sizeOfBucket)+(((numOfApples%sizeOfBucket)==0?0:1))); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
	}
}

