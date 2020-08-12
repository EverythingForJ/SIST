import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(4/0); // ArithmeticException�� instance ���� -> throw
		} catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ���� ����� '|'�� ����Ͽ� ���� ó�� �����ϴ�. �θ� �ڽİ��� �Ұ���");
		} catch(Exception e) { // �θ� ���� ���� �ڽ��� �ؿ� ���� ���� �߻��Ѵ�.
			System.out.println("���� ����");
		}

//		File file = new File("Hello"); // �����о�� �� ����ó���� �ʿ�
//		try {
//			Scanner scan = new Scanner(file);
//		} catch (Exception e) { // Exception e = new FileNotFoundException(); �� ����.
			
			// JOptionPane.showMessageDialog(null, e.getMessage()); // �޼���â���� �˷��ش�.
			// System.out.println(e); // e.toString  // �޼����� ����Ÿ���� �� �� �˷��ش�.
			// System.out.println(e.getMessage()); // ����Ÿ�� ���� �޼����� �����ش�.
			// e.printStackTrace(); // �������ؼ� �ſ� �ڼ��ϰ� �����ش�.
//			if(e instanceof NullPointerException) {
//				System.out.println("File Not Found");
//			} else if(e instanceof ArithmeticException) {
//				System.out.println("ArithmeticException");
//			} else if(e instanceof FileNotFoundException) {
//				System.out.println("FileNotFoundException");
//			}
//		}
		
	}
}
