package _191101_io_net;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberSaveTest {
	public static void main(String[] args) throws IOException {
		/*1. Ű���� �Է�(3���� ���� �Է¹ޱ�)
		 *ex) hr hr ȫ�浿(���̵� ��й�ȣ �̸�)
		 *2. �ԷµǾ��� ������ 
		 *����������Ʈ/member.txt���Ͽ� ���ٷ� ����
		 *3. ������
		 *: ������ ������ ������ �ʰ� �߰� ���� ����
		 */

		Scanner mem = new Scanner(System.in);
		System.out.print("���̵� ��ȣ �̸������� �Է��ϼ��� : ");
		while(mem.hasNext()) {
			System.out.print("���̵� ��ȣ �̸������� �Է��ϼ��� : ");
			String id = mem.next();
			String pwd = mem.next();
			String name = mem.next();
//		String total = mem.nextLine();
		FileWriter fw = new FileWriter("src/member.txt", true);
		fw.write(id+" "+pwd+" "+name+"\n");
//		fw.write(total+"\n");
		fw.close();
		}
		mem.close();
	}

}
/* [������ Ǯ��]
 * Scanner key = new Scanner(System.in);
 * System.out.print("���̵� ��ȣ �̸������� �Է������ : ");
 * String id = key.next();
 * String pw = key.next();
 * String name = key.next();
 * try{
 * FileWriter fw = new FileWirter("meember.txt", true);
 * fw.wrte(id+" "+pw+" "+name+"\n"); // \n: �����ϳ��� �߰� ����
 * fw.close();}
 * catch{IOExcepiton e){
 * e.printStackTrace();
 * }//���߿� �α��� �Ҷ� ���̵�, ��ȣ�� ������? �α��� �����ϰ� => �̷� ���α׷��� ��������!
 * */
