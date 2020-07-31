import java.util.Arrays;
import java.util.Scanner;

/*
작성자 : 김준환
작성목적 : 참조형 반환 타입
작성일지 : 31/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class CallByRefDemo2 {

public static void main(String[] args) {
		int[] array = new int[1000];
		int su = input(array);
		output(array, su);
		
	}

	static int input(int[] array){
		Scanner scan = new Scanner(System.in);
		int su = 0;
		int i=0;
		System.out.println("정수 입력(0은 종료)");
		while((su = scan.nextInt())!=0 && i<1000) {
			array[i++] = su;
		}
		return i;
	} // 배열의 주소를 넘기겠다. 참조형 반환 타입
	
	static void output(int[] array, int su){
		for(int i=0; i<su; i++) {
			System.out.print(array[i]+"\t");
		}
	}

}
