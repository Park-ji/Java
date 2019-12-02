package Example;


class OracleDao implements DataAccessObject{
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}
	public void update() {
		System.out.println("Oracle DB�� ����");
	}
	public void delete() {
		System.out.println("Oracl DB���� ����");
	}
}

class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	public void update() {
		System.out.println("MySql DBB�� ����");
	}
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		dao.print(); // default�� ����Ǿ� �ִ°��� �Ϲ����� �޼ҵ� ���� ����~
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		//static�̹Ƿ� �ٷ� direct�� ��밡��~
		DataAccessObject.staticPrint();
		
	}
	
}
