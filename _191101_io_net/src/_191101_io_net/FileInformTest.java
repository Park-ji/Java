package _191101_io_net;

//P.1018~
import java.io.File; //파일클래스 : 파일 입출력 기능 x
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
//java.sql.Date : db에서 사용
import java.util.Scanner;

public class FileInformTest {
	public static void main(String[] args) throws IOException {
//예외처리 방법 1) throws IOExceiption -> 자바시스템 기본처리방법 : 나도 처리 안할것이고 넘기겠다.
		//키보드 입력
		//파일이나 디렉토리명을 입력하세요
		//File클래스 객체 생성
		System.out.println("파일이나 디렉토리명을 입력하세요");
		//System.in.read(); //String으로 받지 x
		Scanner key = new Scanner(System.in);
		String name = key.next();//공백이 나오기전까지 읽은 하나의 문자열
		//패키지명을 import안하면 해당 메서드를 찾을수가 없으므로 error발생!
		//java.io.File f ..이렇게 하나하나 입력하기 귀찮~ : 패키지 import해놓기!
		File f = new File(name);//File() => 파일명이나 디렉토리명 입력
		//현재 프로젝트 : _191101_io_net
		//../_191029/src : 상위프로젝트(eclipse workspace)의 다른 폴더의 src폴더를 의미
		if(f.exists()) { //파일의 존재 여부
			//파일인경우에만 해당 내용이 필요함
			//디렉토리인경우에는 세부 목록을 출력하게 하기
			if (f.isFile()) { //파일 아니면 디렉토리이므로 false면 디렉토리 임을 의미
				System.out.println("파일 읽기(입력) 여부 = " + f.canRead());
				System.out.println("파일 쓰기(출력) 여부 = " + f.canWrite());
//예외처리 방법 2) try-catch로 예외잡아줌 ==> 이 경우 해당 에러가 발생하는 문장만 감싸도 되지만 전체로 감싸도 된다.		
				System.out.println("파일 저장 경로 = " + f.getCanonicalPath());
				// 알아서 경로를 해석해서 반환해줌 : getCanonicalPath --> canonical : 표준이 되는, 기본이 되는
				// getCanonicalPath : 절대경로
				// error! : getCanonicalPath ==> IOException처리해줘야함
				System.out.println("파일 길이(BYTE) = " + f.length());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println("파일 최종 수정 시간 = " + f.lastModified());
				// 결과가 : 1571103585360
				// java에서는 '1970년 1월 1일'을 기준으로 1/1000초단위로 나타냄
				// 따라서, 저 결과는 1970년 1월 1일 0시0분0초부터 지금 현재까지 경과된 시간
				// 단위는 1/1000이고
				// 1) 즉, 해당 결과를 초단위로 하고 싶으면? 1000으로 나눔
				// 2) 또는 SimpleDateFormat을 사용해서 원하는 형태로 나타낼수 있음
				// lastModified : long타입 ==> 범위가 큰 정수
				String time = sdf.format(new Date(f.lastModified()));
				System.out.println("파일 최종 수정 시간 = " + time);
			}
			else {//디렉토리인 경우
				//f.list의 반환값? String[]
				String details[] = f.list();
				for(String str : details) System.out.println(str);
			}
		
		}
		else {
			System.out.println(name+"은(는) 존재하지 않습니다.");
		}
		
	}
}

//기준 경로를 모르겠을때? '.'을 입력함
//'..' : 현재폴더의 상위 폴더
//'src/현재프로젝트/*.java' => 기준 경로 생략시 ? 자동으로 들어가있음

//java.text.SimpleDateFormat : 11장
//SimpleDateForamt s = new SimpleDateFormat("yyyy"); => new로 새로운 객체 생성
//yyyy-MM-dd HH:mm:ss -> M : month , m :minute(java는 대,소문자를 구분하기 때문에)
//sysout(s.format(날짜와시간정보객체));
//sysout(s.format(new Date(f.lasgModified()));
//Date는 날짜로 만들어준다.(s.format의 매개변수 타입 : Date)
