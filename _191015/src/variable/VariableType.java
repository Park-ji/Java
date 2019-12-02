package variable;

public class VariableType {
	public static void main(String[] args) {
		byte by = 65;
		int in = by;
		System.out.println(in);
		
		in = 120;
		//by=in;불가
		System.out.println(in);
		
		char ch = 'a';
		in = ch;
		//ch=in; 불가(이유 : int(4byte) -> char(1byte))
		
		double dou = in;//가능(이유 : int(4byte), double(8byte))
		
		//강제 형변환
		//바꾸고자 하는 형을 앞에 ()안에 선언해줌
		by = (byte)in;
		
		int score = 95;
		char grade = ((score>=95)?'S':((score>90)?'A':((score>80)?'B':'C')));
		System.out.println(grade);
	}

}
