import java.util.Scanner;

public class Input {
	Scanner scan;
	Patient[] array;
	
	public Input(Patient[] array) {
		this.scan = new Scanner(System.in);
		this.array = array;
	}
	
	public int input() {
		
		int count=0;
		char y_n = '\0';
		do {
			count++;
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
			
			this.array[count-1] = new Patient(no, code, days, age);
			
		} while( count<=5 && (y_n == 'i' || y_n == 'I'));
		
		return count;
	}
	
}