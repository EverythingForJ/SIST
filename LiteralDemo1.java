/*
작성자 : 김준환
작성목적 : literal 연습
작성일지 : 2020.07.17
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class LiteralDemo1 {
	public static void main(String[] args) {
/*		System.out.printf("%f\n",314.1592);
		System.out.printf("%e\n",314.1592);
		System.out.printf("%f\n",0.567892E-05);
		System.out.printf("%e",0.567892E-05);
*/
		System.out.printf("%.18f\n",0.123456789123456789);
		System.out.printf("%.18f\n",0.123456789123456789f);
	}
}