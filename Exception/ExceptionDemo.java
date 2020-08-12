import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(4/0); // ArithmeticException형 instance 생성 -> throw
		} catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("둘은 동등 관계라서 '|'를 사용하여 같이 처리 가능하다. 부모 자식간은 불가능");
		} catch(Exception e) { // 부모를 위에 쓰고 자식을 밑에 쓰면 에러 발생한다.
			System.out.println("내가 잡음");
		}

//		File file = new File("Hello"); // 파일읽어올 땐 예외처리가 필요
//		try {
//			Scanner scan = new Scanner(file);
//		} catch (Exception e) { // Exception e = new FileNotFoundException(); 과 같다.
			
			// JOptionPane.showMessageDialog(null, e.getMessage()); // 메세지창으로 알려준다.
			// System.out.println(e); // e.toString  // 메세지와 예외타입을 둘 다 알려준다.
			// System.out.println(e.getMessage()); // 예외타입 말고 메세지만 보여준다.
			// e.printStackTrace(); // 역추적해서 매우 자세하게 보여준다.
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
