/*
작성자 : 김준환
작성목적 : 실수저장방법
작성일지 : 20/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class 실수저장방법 {
	public static void main(String[] args) {
		float original = 25.5f;
		int result = Float.floatToIntBits(original);
		System.out.printf("result=%d\n", result);
		System.out.printf("result=%x\n", result);

		double target = 25.5;
		long result1 = Double.doubleToLongBits(target);
		System.out.printf("result=%d\n", result1);
		System.out.printf("result=%x\n", result1);
	}
}