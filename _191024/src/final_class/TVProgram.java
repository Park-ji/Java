package final_class;

public class TVProgram {
	private String director;
	
	//final�� ���� ����ϴ� ���? ����Ʈ��� �� ����ϴ� ���~
	public void setDirector(final String director) { //�̷��� �Ű������� ������ �ܺο��� �޾ƿ� ���� �ٲܼ��� ����(�Ʒ��� ����)
		//director = "kim"; //�ܺο��� �޴� ���� �ٲܼ� ����
		this.director = director;
	}

}
