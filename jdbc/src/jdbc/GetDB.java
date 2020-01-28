package jdbc;

import java.sql.*;

public class GetDB {
	public static void main(String[] args) {
		//system - kitri
		//java에서 db 접근 : url로 접근
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		//아무것도 설정안되어있으면 위의 url이 맞음
		String ID = "hr"; //Oracle ID
		String PW = "hr"; //Oracle PW
		
		Connection conn = null;
		Statement stmt = null;
		//PreparedStatement pstm = null; -> 요즘은 이게 더 빠르다고 해서 stmt대신에 사용함
		ResultSet rs = null;//DB 명령 수행 결과
		
		String query = "Select * from employees";
		
		//1. open driver
		try {
			
			//prepareStatment사용시
			//conn = DBConnection.getConnection();
			//pstm = conn.prepareStatement(quary);
			//rs = pstm.executeQurey();
			//connection을 할때부터 query 셋을 해놓고 시작함
			
			//1. open driver
			conn = DriverManager.getConnection(URL, ID, PW);
			//어떤 위치로 통신을 열것인지~
			//2. conn, request
			stmt = conn.createStatement();
			//통신이 잘 되었다면 conn에 객체가 만들어지고
			//conn.createStatement()를 이용해서 진짜로 conn을 실행
			//conn이 열린 상태를 stmt에 저장
			//3. result
			rs = stmt.executeQuery(query);//쿼리를 날림
			while(rs.next()) {//행이있는지 없는지 확인 -> 있으면 : true 
				String line1 = rs.getString(1); //1의 의미 : 1번째 column
				String line2 = rs.getString(2);
				System.out.println(line1+" "+line2);
				//찾은 데이터들은 rs에 다 들어가있음
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			rs.close();
			stmt.close();
			conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
