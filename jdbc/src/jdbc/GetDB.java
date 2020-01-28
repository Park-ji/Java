package jdbc;

import java.sql.*;

public class GetDB {
	public static void main(String[] args) {
		//system - kitri
		//java���� db ���� : url�� ����
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		//�ƹ��͵� �����ȵǾ������� ���� url�� ����
		String ID = "hr"; //Oracle ID
		String PW = "hr"; //Oracle PW
		
		Connection conn = null;
		Statement stmt = null;
		//PreparedStatement pstm = null; -> ������ �̰� �� �����ٰ� �ؼ� stmt��ſ� �����
		ResultSet rs = null;//DB ��� ���� ���
		
		String query = "Select * from employees";
		
		//1. open driver
		try {
			
			//prepareStatment����
			//conn = DBConnection.getConnection();
			//pstm = conn.prepareStatement(quary);
			//rs = pstm.executeQurey();
			//connection�� �Ҷ����� query ���� �س��� ������
			
			//1. open driver
			conn = DriverManager.getConnection(URL, ID, PW);
			//� ��ġ�� ����� ��������~
			//2. conn, request
			stmt = conn.createStatement();
			//����� �� �Ǿ��ٸ� conn�� ��ü�� ���������
			//conn.createStatement()�� �̿��ؼ� ��¥�� conn�� ����
			//conn�� ���� ���¸� stmt�� ����
			//3. result
			rs = stmt.executeQuery(query);//������ ����
			while(rs.next()) {//�����ִ��� ������ Ȯ�� -> ������ : true 
				String line1 = rs.getString(1); //1�� �ǹ� : 1��° column
				String line2 = rs.getString(2);
				System.out.println(line1+" "+line2);
				//ã�� �����͵��� rs�� �� ������
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
