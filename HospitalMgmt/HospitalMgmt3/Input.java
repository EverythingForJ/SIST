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
			System.out.print("��ȣ�� ? : ");
			int no = scan.nextInt();

			System.out.print("�����ڵ�� ? : ");
			String code = scan.next();

			System.out.print("�Կ��ϼ��� ? :");
			int days = scan.nextInt();

			System.out.print("���̴�? : ");
			int age = scan.nextInt();
			
			System.out.print("�Է�/��� (I/O)?");
			y_n = this.scan.next().charAt(0);
			
			vector.add(new Patient(no,code,days,age));
			
		} while( y_n == 'i' || y_n == 'I');
		
	}
	
}