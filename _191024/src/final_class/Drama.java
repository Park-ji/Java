package final_class;

//TVProgram�� final�� ���� ����� ���ұ⶧���� --> ����� �ȵ�
public class Drama extends TVProgram {

	//setDirector�� final�� ���ұ� ������ �������̵��� ���� �ʴ´٤���
		@Override
	public void setDirector(String director) {
		System.out.println("director setting");
		super.setDirector("kim");
	}

}
