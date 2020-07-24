/*
작성자 : 김준환
작성목적 : for()
작성일지 : 24/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForDemo5 {
	public static void main(String[] args) {
		String[] fruits = {"사과","딸기","포도","수박","복숭아"};
		//for (int i =0;i<5;i++){
		//	System.out.println("fruits["+i+"] ="+ fruits[i]);
		//}
		for(String myvalue : fruits){ // ( 넣을곳 : 반복의 대상( 배열또는 컬렉션))
			System.out.println(myvalue);
		} // 인덱스를 계산하지않아서 속도가 향상된 for문
	}
}