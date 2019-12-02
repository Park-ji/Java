package HW;

public class Exercise1 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5)/100f;
		//둘쨋자리까지 나타남 = * 100
		//셋째자리에서 반올림 = +0.5
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.printf("Celcius:"+celcius);
	}
}
