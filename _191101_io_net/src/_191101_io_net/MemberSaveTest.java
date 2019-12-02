package _191101_io_net;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberSaveTest {
	public static void main(String[] args) throws IOException {
		/*1. 키보드 입력(3가지 내용 입력받기)
		 *ex) hr hr 홍길동(아이디 비밀번호 이름)
		 *2. 입력되어진 내용을 
		 *현재프로젝트/member.txt파일에 한줄로 저장
		 *3. 저장방식
		 *: 기존의 내용을 지우지 않고 추가 저장 가능
		 */

		Scanner mem = new Scanner(System.in);
		System.out.print("아이디 암호 이름순으로 입력하세요 : ");
		while(mem.hasNext()) {
			System.out.print("아이디 암호 이름순으로 입력하세요 : ");
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
/* [선생님 풀이]
 * Scanner key = new Scanner(System.in);
 * System.out.print("아이디 암호 이름순으로 입려사헤요 : ");
 * String id = key.next();
 * String pw = key.next();
 * String name = key.next();
 * try{
 * FileWriter fw = new FileWirter("meember.txt", true);
 * fw.wrte(id+" "+pw+" "+name+"\n"); // \n: 라인하나를 추가 했음
 * fw.close();}
 * catch{IOExcepiton e){
 * e.printStackTrace();
 * }//나중에 로그인 할때 아이디, 암호가 같으면? 로그인 가능하게 => 이런 프로그램이 가능해짐!
 * */
