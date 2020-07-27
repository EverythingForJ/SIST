/*
작성자 : 김준환
작성목적 : parseInt,toString
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ParseDemo {
	public static void main(String[] args) {
		//String str = "128";
		//int su = Integer.parseInt(str); // 128 // 문자형 128을 숫자형 128로 바꿔준다.
		// 기본적으로 10진수로 판단.
		//System.out.print(su);
		
		// 숫자를 스트링으로
		int su = 128;
		// String str = ""+su; // 방법1.한쪽 스트링이면 자동으로 스트링으로 바꿈
		//String str = String.valueOf(su); // 방법2.
		String str = Integer.toString(su, 16); // 방법3. // 다른진법으로 변환 가능
		System.out.printf("%s",str);
	}
}