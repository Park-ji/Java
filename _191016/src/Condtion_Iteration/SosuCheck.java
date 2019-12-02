package Condtion_Iteration;

public class SosuCheck {
public static void main(String[] args) {
	int cnt = 0;
	int num = 10;
	
	if(num%2==0) cnt++;
	if(num%3==0) cnt++;
	if(num%4==0) cnt++;
	if(num%5==0) cnt++;
	if(num%6==0) cnt++;
	if(num%7==0) cnt++;
	if(num%8==0) cnt++;
	if(num%9==0) cnt++;
	if(num%10==0) cnt++;
			
	if(cnt==1) System.out.println("소수");
	else System.out.println("소수x");
}
}
