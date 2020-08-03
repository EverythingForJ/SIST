import java.util.Scanner;

public class Input {
	void input(Product[] array){
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<array.length; i++) {
			Product p = new Product();
			System.out.print("상품 이름 : "); 
			p.setName(scan.next());
			System.out.print("수량 : ");
			p.setQuantity(scan.nextInt());
			System.out.print("판매 단가 : ");
			p.setSellmoney(scan.nextInt());
			System.out.print("매입 단가 : ");
			p.setBuymoney(scan.nextInt());
			System.out.print("운송료 : ");
			p.setFee(scan.nextInt());
			array[i] = p;
		}
	}
}
