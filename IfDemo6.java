/*
작성자 : 김준환
작성목적 : 가장 크고, 작은 수 찾기
작성일지 : 23/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class IfDemo6 {
	public static void main(String[] args) {
		double avg = 89.12345678;
		avg *= 10; // 소수점 첫째까지 보기 위해 곱하고 
		double result = Math.round(avg);
		result /= 10; // 나눈다. 둘째자리까지 보려면 100을 곱하고 나눔
		System.out.print(result);
	}
}