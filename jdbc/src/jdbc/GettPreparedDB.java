package jdbc;

import java.sql.*;

public class GettPreparedDB {
	public static void main(String[] args) {
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String ID = "hr";
		String PW = "hr";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String query = "Select * from employees";
		
		try {
			conn = DriverManager.getConnection(URL,ID,PW);
			pstm = conn.prepareStatement(query);
			//query�� ������ ���� �������
			//������ ���� �غ������Ƿ� �� ���� ����� ������ ����
			rs = pstm.executeQuery();
			while(rs.next()) {
				String line1 = rs.getString(1);
				System.out.println(line1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
