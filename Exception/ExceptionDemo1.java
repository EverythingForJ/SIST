import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ��� : ");
		
		try{
			int kor = scan.nextInt();
		
		if(kor <0 || kor > 100 ) throw new RuntimeException("���������� �ùٸ��� �Է��ϼ���.");
		System.out.println("kor = " + kor );				
		}catch(RuntimeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			// System.out.println(e.getMessage());
		}
	}
}
