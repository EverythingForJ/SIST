/*
�ۼ��� : ����ȯ
�ۼ����� : ��ǰ
�ۼ����� : 28/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;

public class ProductMgmt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] array;
		array = new Product[2];
		array[0] = new Product();
		array[1] = new Product();
		
		for(int i=0; i<array.length; i++){
			System.out.print("��ǰ �̸� : ");
			array[i].name = scan.next();
			System.out.print("��ǰ ���� : ");
			array[i].price = scan.nextInt();
			System.out.print("��ǰ ���� : ");
			array[i].quantity = scan.nextInt();
		}
		for(Product p:array){
			System.out.printf("�̸� = %s, ���� = %d, ���� = %d%n",
									p.name,p.price,p.quantity);
		}
	}
}

class Product{
	String name;
	int price, quantity;
}