import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
//		System.out.print("�� ���� ���ڸ� �Է����ּ��� : ");
//		InputStream is = new InputStream();
		System.out.print("��� ���� ������? : ");
		
		InputStream is = System.in; // Ű����κ��� �о���̴� ǥ�� �Է� ��Ʈ����
		String season ="";
		try {
			while(true) {
				int su = is.read(); // ASCII�� �д´�
				if(su<0||(char)su == '\n')break;
				else season += (char)su;
			}
			System.out.println("season = "+season);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
