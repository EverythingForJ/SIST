/*
작성자 : 김준환
작성목적 : 제품
작성일지 : 28/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
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
			System.out.print("제품 이름 : ");
			array[i].name = scan.next();
			System.out.print("제품 가격 : ");
			array[i].price = scan.nextInt();
			System.out.print("제품 수량 : ");
			array[i].quantity = scan.nextInt();
		}
		for(Product p:array){
			System.out.printf("이름 = %s, 가격 = %d, 수량 = %d%n",
									p.name,p.price,p.quantity);
		}
	}
}

class Product{
	String name;
	int price, quantity;
}