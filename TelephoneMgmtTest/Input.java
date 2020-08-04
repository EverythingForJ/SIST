import java.util.Scanner;

public class Input {
	private Scanner scan;
	private Telephone[] array;
	public Input(Telephone[] array) { // Default Constructor's Overriding
		this.scan = new Scanner(System.in);
		this.array = array;
	}
	
	public void input() {
		for(int i = 0; i<this.array.length; i++) {
			System.out.println("����(1 : ������, 2 : ��û��, 3 : ������) : ");
			int kind = this.scan.nextInt();
			System.out.println("��ȭ��ȣ : ");
			String tel = scan.next();
			System.out.println("�̸� : ");
			String name = scan.next();
			System.out.println("��ȭ�� : ");
			int quantity = scan.nextInt();
			Telephone phone = new Telephone(kind, tel, name, quantity);
			array[i] = phone;
		}
		
		return;
	}
}