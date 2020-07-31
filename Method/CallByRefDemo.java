/*
작성자 : 김준환
작성목적 : 
작성일지 : 31/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class CallByRefDemo {

	public static void main(String[] args) {
		String str = "Hello"; // 참조형이고 주소를 넘기지만 바뀌지않는다. 기본형과 string은 값이 변하지않는다. string은 상수이기때문에. 
		StringBuffer sb = new StringBuffer("Hello"); // 주소를 넘겨서 값이 바뀐다.
		System.out.println("수정 전");
		System.out.println("str = "+ str + ", sb = "+ sb.toString());
		change(str, sb); // call by reference
		System.out.println("수정 후");
		System.out.println("str = "+ str + ", sb = "+ sb.toString());
	}
	
	static void change(String str, StringBuffer sb) {
		str +=", World";
		sb.append(", World");
		System.out.println("함수에서");
		System.out.println("str = "+ str + ", sb = "+ sb.toString());
	}
}