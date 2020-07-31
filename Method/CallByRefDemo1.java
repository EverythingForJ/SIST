import java.util.Arrays;
import java.util.Scanner;

/*
작성자 : 김준환
작성목적 : 참조형 반환 타입
작성일지 : 31/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class CallByRefDemo1 {

	public static void main(String[] args) {
		
		int[] array = input();
		output(array);
		// output(input);
	}

	static int[] input(){
		Scanner scan = new Scanner(System.in);
		int[] array = new int[7];
		for(int i=0; i<array.length; i++) {
			System.out.print("정수 >> "); array[i] = scan.nextInt();
		}
		return array;
	} // 배열의 주소를 넘기겠다. 참조형 반환 타입
	
	static void output(int[] array){
		System.out.println(Arrays.toString(array));
	}


}
