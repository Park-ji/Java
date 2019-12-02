package poly;

public class Tire {
	String location; // Ÿ�̾��� ��ġ
	String brand; // �귣��
	int inch; // Ÿ�̾��� ũ��
	// int maxrotation�� ���ó���Ϸ��� -> static final ���̰� �������� �빮�ڷ� �ٲ�
	// static final int MAX_ROTATION = 1000; // ����
	int maxRotation = 1000;
	// ��, 1000���� �̻� ���� ������ ���ƾ� �ȴٴ� �Ҹ�
	int curRotation; // ���� ����� ���ư�����

	private Tire(String location) { // �̷��� �����ǰ� �ϴ� ���� �������ؼ�? private���� ����
		this.location = location;
	}

	Tire(String location, String brand, int inch, int maxRotation) {
		this(location); // �����ڿ��� ������ �����
		this.brand = brand;
		this.inch = inch;
		this.maxRotation = maxRotation;
	}

	boolean roll() {// ������ �������� �ǹ�~
		curRotation++;
		if (curRotation >= maxRotation) {
			System.out.println(location + "Ÿ�̾ �ٲ��ּ���.");
		}
		return true;
	}

}
