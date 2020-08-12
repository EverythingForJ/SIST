import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요 : ");
		
		try{
			int kor = scan.nextInt();
		
		if(kor <0 || kor > 100 ) throw new RuntimeException("국어점수를 올바르게 입력하세요.");
		System.out.println("kor = " + kor );				
		}catch(RuntimeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			// System.out.println(e.getMessage());
		}
	}
}
