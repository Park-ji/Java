package _191101_io_net;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyTest {
	public static void main(String[] args) {
		// a.txt b.txt
		// a.txt 파일(입력)을 b.txt파일(출력)로 복사 구현
		System.out.println("파일명 두개를 입력하세요(입력파일명 출력파일명)");
		Scanner key = new Scanner(System.in);
		String inFile = key.next(); // 공백으로 분리 되기 때문에 이렇게 받으면? 입력파일명을 의미
		String outFile = key.next();

//	FileReader fr = null; //선언만
// error 표시중 전구에 있는 x표가 작을때? import나 예외처리 안될때
		// 입출력 단계 : 1->2->3
		try {
			// 1. 입출력파일 설정 객체
			File f = new File(inFile);
			if (f.exists()) {// FileNotException예방 => File클래스 사용
				FileReader fr = new FileReader(inFile);
				/*
				 * 1)입력파일이 존재x : FileNotException(IOException종류 중 하나) 
				 * 2)입력파일이 존재o : 정상 수행
				 */
				if(f.canWrite()) { //쓰기 가능할 경우만 사용 -> File클래스 사용
				FileWriter fw = new FileWriter(outFile, true);
				/*
				 * 1)출력파일 존재 x : empty 파일 생성 출력
				 * 2)출력파일 존재 o : 
				 * 2-1)기존 내용 삭제 후 출력 : 두번째 매개변수를 false또는 적지 x 
				 * 2-2)기존 애용 유지 추가 출력 : 두번째 매개변수를 true
				 */
				int result = 0;
				// 2. 입출력 기능 ex)복사
				while ((result = fr.read()) != -1) {// fr파일의 끝을 만날때까지
					fw.write(result);
				
				// 3. 종료
				fw.close();
				//메모리버퍼에 저장된것을 파일에 저장함(이 문장이 없으면 실제로 저장 x)
				fr.close();
				}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//실행 경우의 수(1~4)

//case 1 : a.txt b.txt
//이렇게 파일을 주면? 기준은 현재 프로젝트가 됨 => a.txt는 없는 파일 : FileNotFoundException발생

//case 2 : src/_191101_io_net/FileCopyTest.java b.txt
//이렇게 쓰면? 입력파일은 있지만 출력 파일(b.txt)은 없음 : 일단, error는 발생은 안되고 종료됨
//프로젝트 -> 오른쪽 마우스 -> refresh : b.txt 만들어짐
//출력파일은 없다면 그냥 만들어줌!

//case 3 : src/_191101_io_net/ScannerTest.java b.txt
//이렇게 쓰면? 입력파일도 있고 출력파일도 있는 상태
//기존에 있던 b.txt의 내용은 사라지고 새롭게 갱신됨!

//case 4 : FileWriter생성하는 곳의 소스코드를 (outFile,true);처럼 true을 추가
//src/_191101_io_net/KeyboardTest.java b.txt
//기존의 내용을 삭제안하고 추가됨

//case 5: f.close()를 없앨경우
//src/_191101_io_net/KeyboardTest.java c.txt
//생긴 c.txt파일안에 아무것도 적용 x
