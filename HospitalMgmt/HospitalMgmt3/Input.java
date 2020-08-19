import java.util.Scanner;
import java.util.Vector;

class Input {
	Scanner scan;
	Vector<Patient> vector;
	
	Input(Vector<Patient> vector) {
		this.scan = new Scanner(System.in);
		this.vector = vector;
	}
	
	void input() {
		
		char y_n = '\0';
		do {
			System.out.print("번호는 ? : ");
			int no = scan.nextInt();

			System.out.print("진료코드는 ? : ");
			String code = scan.next();

			System.out.print("입원일수는 ? :");
			int days = scan.nextInt();

			System.out.print("나이는? : ");
			int age = scan.nextInt();
			
			System.out.print("입력/출력 (I/O)?");
			y_n = this.scan.next().charAt(0);
			
			vector.add(new Patient(no,code,days,age));
			
		} while( y_n == 'i' || y_n == 'I');
		
	}
	
}