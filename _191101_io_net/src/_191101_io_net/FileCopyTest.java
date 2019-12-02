package _191101_io_net;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyTest {
	public static void main(String[] args) {
		// a.txt b.txt
		// a.txt ����(�Է�)�� b.txt����(���)�� ���� ����
		System.out.println("���ϸ� �ΰ��� �Է��ϼ���(�Է����ϸ� ������ϸ�)");
		Scanner key = new Scanner(System.in);
		String inFile = key.next(); // �������� �и� �Ǳ� ������ �̷��� ������? �Է����ϸ��� �ǹ�
		String outFile = key.next();

//	FileReader fr = null; //����
// error ǥ���� ������ �ִ� xǥ�� ������? import�� ����ó�� �ȵɶ�
		// ����� �ܰ� : 1->2->3
		try {
			// 1. ��������� ���� ��ü
			File f = new File(inFile);
			if (f.exists()) {// FileNotException���� => FileŬ���� ���
				FileReader fr = new FileReader(inFile);
				/*
				 * 1)�Է������� ����x : FileNotException(IOException���� �� �ϳ�) 
				 * 2)�Է������� ����o : ���� ����
				 */
				if(f.canWrite()) { //���� ������ ��츸 ��� -> FileŬ���� ���
				FileWriter fw = new FileWriter(outFile, true);
				/*
				 * 1)������� ���� x : empty ���� ���� ���
				 * 2)������� ���� o : 
				 * 2-1)���� ���� ���� �� ��� : �ι�° �Ű������� false�Ǵ� ���� x 
				 * 2-2)���� �ֿ� ���� �߰� ��� : �ι�° �Ű������� true
				 */
				int result = 0;
				// 2. ����� ��� ex)����
				while ((result = fr.read()) != -1) {// fr������ ���� ����������
					fw.write(result);
				
				// 3. ����
				fw.close();
				//�޸𸮹��ۿ� ����Ȱ��� ���Ͽ� ������(�� ������ ������ ������ ���� x)
				fr.close();
				}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//���� ����� ��(1~4)

//case 1 : a.txt b.txt
//�̷��� ������ �ָ�? ������ ���� ������Ʈ�� �� => a.txt�� ���� ���� : FileNotFoundException�߻�

//case 2 : src/_191101_io_net/FileCopyTest.java b.txt
//�̷��� ����? �Է������� ������ ��� ����(b.txt)�� ���� : �ϴ�, error�� �߻��� �ȵǰ� �����
//������Ʈ -> ������ ���콺 -> refresh : b.txt �������
//��������� ���ٸ� �׳� �������!

//case 3 : src/_191101_io_net/ScannerTest.java b.txt
//�̷��� ����? �Է����ϵ� �ְ� ������ϵ� �ִ� ����
//������ �ִ� b.txt�� ������ ������� ���Ӱ� ���ŵ�!

//case 4 : FileWriter�����ϴ� ���� �ҽ��ڵ带 (outFile,true);ó�� true�� �߰�
//src/_191101_io_net/KeyboardTest.java b.txt
//������ ������ �������ϰ� �߰���

//case 5: f.close()�� ���ٰ��
//src/_191101_io_net/KeyboardTest.java c.txt
//���� c.txt���Ͼȿ� �ƹ��͵� ���� x
