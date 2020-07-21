/*
작성자 : 김준환
작성목적 : ReferenceDemo
작성일지 : 21/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceDemo {
	public static void main(String[] args) {
		Car sonata = new Car(); // 객체를 생성하며 항상 4바이트다.(주소를 가져오기 때문에). 
		// 주소를 저장하는 참조형이라한다.
		sonata.name = "소나타"; // 할당
		sonata.price = 25_000_000; // 숫자를 쉽게 알아보기위해 표시하는 _. 콤마는 문자라서 대신 언더바사용
		sonata.maker = "현대"; // 할당
		int age=24;	

		Car canival = new Car();
		canival.name = "카니발";
		canival.price = 35_000_000;
		canival.maker = "기아자동차"; // 카니발이라는 주소안에 maker라는 방이 있다.

		sonata.carPrint();
		canival.carPrint();
	}
}

class Car{
	String name;
	int price;
	String maker;

	public void carPrint(){
		System.out.printf("이름 = %s, 가격 = %d, 제조사 = %s\n",name, price, maker);
	}
}