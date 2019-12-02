package _191101_io_net;

//P.1018~
import java.io.File; //����Ŭ���� : ���� ����� ��� x
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
//java.sql.Date : db���� ���
import java.util.Scanner;

public class FileInformTest {
	public static void main(String[] args) throws IOException {
//����ó�� ��� 1) throws IOExceiption -> �ڹٽý��� �⺻ó����� : ���� ó�� ���Ұ��̰� �ѱ�ڴ�.
		//Ű���� �Է�
		//�����̳� ���丮���� �Է��ϼ���
		//FileŬ���� ��ü ����
		System.out.println("�����̳� ���丮���� �Է��ϼ���");
		//System.in.read(); //String���� ���� x
		Scanner key = new Scanner(System.in);
		String name = key.next();//������ ������������ ���� �ϳ��� ���ڿ�
		//��Ű������ import���ϸ� �ش� �޼��带 ã������ �����Ƿ� error�߻�!
		//java.io.File f ..�̷��� �ϳ��ϳ� �Է��ϱ� ����~ : ��Ű�� import�س���!
		File f = new File(name);//File() => ���ϸ��̳� ���丮�� �Է�
		//���� ������Ʈ : _191101_io_net
		//../_191029/src : ����������Ʈ(eclipse workspace)�� �ٸ� ������ src������ �ǹ�
		if(f.exists()) { //������ ���� ����
			//�����ΰ�쿡�� �ش� ������ �ʿ���
			//���丮�ΰ�쿡�� ���� ����� ����ϰ� �ϱ�
			if (f.isFile()) { //���� �ƴϸ� ���丮�̹Ƿ� false�� ���丮 ���� �ǹ�
				System.out.println("���� �б�(�Է�) ���� = " + f.canRead());
				System.out.println("���� ����(���) ���� = " + f.canWrite());
//����ó�� ��� 2) try-catch�� ��������� ==> �� ��� �ش� ������ �߻��ϴ� ���常 ���ε� ������ ��ü�� ���ε� �ȴ�.		
				System.out.println("���� ���� ��� = " + f.getCanonicalPath());
				// �˾Ƽ� ��θ� �ؼ��ؼ� ��ȯ���� : getCanonicalPath --> canonical : ǥ���� �Ǵ�, �⺻�� �Ǵ�
				// getCanonicalPath : ������
				// error! : getCanonicalPath ==> IOExceptionó���������
				System.out.println("���� ����(BYTE) = " + f.length());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println("���� ���� ���� �ð� = " + f.lastModified());
				// ����� : 1571103585360
				// java������ '1970�� 1�� 1��'�� �������� 1/1000�ʴ����� ��Ÿ��
				// ����, �� ����� 1970�� 1�� 1�� 0��0��0�ʺ��� ���� ������� ����� �ð�
				// ������ 1/1000�̰�
				// 1) ��, �ش� ����� �ʴ����� �ϰ� ������? 1000���� ����
				// 2) �Ǵ� SimpleDateFormat�� ����ؼ� ���ϴ� ���·� ��Ÿ���� ����
				// lastModified : longŸ�� ==> ������ ū ����
				String time = sdf.format(new Date(f.lastModified()));
				System.out.println("���� ���� ���� �ð� = " + time);
			}
			else {//���丮�� ���
				//f.list�� ��ȯ��? String[]
				String details[] = f.list();
				for(String str : details) System.out.println(str);
			}
		
		}
		else {
			System.out.println(name+"��(��) �������� �ʽ��ϴ�.");
		}
		
	}
}

//���� ��θ� �𸣰�����? '.'�� �Է���
//'..' : ���������� ���� ����
//'src/����������Ʈ/*.java' => ���� ��� ������ ? �ڵ����� ������

//java.text.SimpleDateFormat : 11��
//SimpleDateForamt s = new SimpleDateFormat("yyyy"); => new�� ���ο� ��ü ����
//yyyy-MM-dd HH:mm:ss -> M : month , m :minute(java�� ��,�ҹ��ڸ� �����ϱ� ������)
//sysout(s.format(��¥�ͽð�������ü));
//sysout(s.format(new Date(f.lasgModified()));
//Date�� ��¥�� ������ش�.(s.format�� �Ű����� Ÿ�� : Date)
