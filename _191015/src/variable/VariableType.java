package variable;

public class VariableType {
	public static void main(String[] args) {
		byte by = 65;
		int in = by;
		System.out.println(in);
		
		in = 120;
		//by=in;�Ұ�
		System.out.println(in);
		
		char ch = 'a';
		in = ch;
		//ch=in; �Ұ�(���� : int(4byte) -> char(1byte))
		
		double dou = in;//����(���� : int(4byte), double(8byte))
		
		//���� ����ȯ
		//�ٲٰ��� �ϴ� ���� �տ� ()�ȿ� ��������
		by = (byte)in;
		
		int score = 95;
		char grade = ((score>=95)?'S':((score>90)?'A':((score>80)?'B':'C')));
		System.out.println(grade);
	}

}
