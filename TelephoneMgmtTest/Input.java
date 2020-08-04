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
			System.out.println("구분(1 : 영업용, 2 : 관청용, 3 : 가정용) : ");
			int kind = this.scan.nextInt();
			System.out.println("전화번호 : ");
			String tel = scan.next();
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("통화량 : ");
			int quantity = scan.nextInt();
			Telephone phone = new Telephone(kind, tel, name, quantity);
			array[i] = phone;
		}
		
		return;
	}
}