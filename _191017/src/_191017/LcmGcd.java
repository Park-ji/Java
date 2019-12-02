package _191017;

public class LcmGcd {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		int gcm = 0;
		int lcm;

		int i = 1;

		//int Bignum = num1 > num2 ? num1 : num2;
		int Bignum = Math.max(num1, num2);
		while (i <= Bignum) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcm = i; //마지막에 저장된 값 : 최대공약수
			}
			i++;
		}
		lcm = (num1 * num2) / gcm;
		System.out.println("최대공약수 : " + gcm + ", 최소공배수: " + lcm);

	}
}
