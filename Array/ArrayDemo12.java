/*
작성자 : 김준환
작성목적 : string에서 char[]로 만들기
작성일지 : 28/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ArrayDemo12 {
	public static void main(String[] args) {
		String str="서울시 강남구 역삼동";
		char[] array = str.toCharArray(); // string에서 char[]로 만들기
		for(int i=0; i<array.length;i++){
			System.out.printf("%c",array[i]);
		}
		array[0]='경';
		array[1]='기';
		array[2]='도';
		System.out.println();
//		for(int i=0; i<array.length;i++){
//			System.out.printf("%c",array[i]);
//		}
		
		str = new String(array);
		System.out.println(str);
		// String은 값이 변하지않는 상수다.
	}
}