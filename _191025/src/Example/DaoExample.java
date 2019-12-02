package Example;


class OracleDao implements DataAccessObject{
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	public void update() {
		System.out.println("Oracle DB를 수정");
	}
	public void delete() {
		System.out.println("Oracl DB에서 삭제");
	}
}

class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	public void update() {
		System.out.println("MySql DBB를 수정");
	}
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		dao.print(); // default로 선언되어 있는것은 일반적인 메소드 사용과 같음~
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		//static이므로 바로 direct로 사용가능~
		DataAccessObject.staticPrint();
		
	}
	
}
