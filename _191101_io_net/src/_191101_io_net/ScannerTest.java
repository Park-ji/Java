package _191101_io_net;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//�ƿ� �� �Է��س��� ���� => String[] args
		Scanner key = new Scanner(System.in);
		//Scanner�ȿ� Ű���� �Ӹ��� �ƴ϶� ���ϰ� ���� �͵� ����~
		System.out.println("���� 2���� �Է��ϼ���");
		//�����ϴ� ��? �������� ������(ex : 10 20)
		int first = key.nextInt();
		int second = key.nextInt();
		System.out.println(first+second);
		System.out.println("�ѱ۹��ڿ��� �Է��ϼ���.");
		String str = key.next();
		//nextLIne()�� /n���� ���� 
		System.out.println(str);
	}

}
