package HW;

public class Exercise1 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5)/100f;
		//��¶�ڸ����� ��Ÿ�� = * 100
		//��°�ڸ����� �ݿø� = +0.5
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.printf("Celcius:"+celcius);
	}
}
