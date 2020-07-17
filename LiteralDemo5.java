/*
작성자 : 
작성목적 : 
작성일지 : 
작성환경 : OS(windows10), JAVA VERSION(JDK-14.0.2). , 어떤 에디터를 썻는지(eclips
*/

// System.out.println();
public class LiteralDemo5 {
	public static void main(String[] args) {
		// 여러개의 타입을 한번에 출력할때 printf쓰는 것이 좋다.
		System.out.printf("%d %f %s %c %b\n", 
									24, 3.14, "Hello", 'c', 4<6);
		// %7.2f에서 7정수의 자리, 간격이 생김. 0.2f는 소수점 표기자리. /// %다음숫자는 간격
		System.out.printf("%5d%7.2f%10s%5c%5b\n", 24, 3.14, "Hello", 'c', 4<6);
		System.out.printf("%-5d%5.2f%5s%5c%5b\n", 24, 3.14, "Hello", 'c', 4<6);

	}
}