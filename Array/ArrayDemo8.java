/*
작성자 : 김준환
작성목적 : 배열 출력하는 여러 방법들
작성일지 : 28/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Arrays;

public class ArrayDemo8 {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		int[] array2 = new int[10];
		array2=array;

		for(int i=0; i<array.length; i++){
			System.out.printf("%5d",array2[i]);
		} // 출력하기위한 준비시간이 걸린다.
		
		for(int su:array){// 강화된 for문
			System.out.printf("%5d",su);
		} // 속도가 빠르다, 다만 연산이 불가능하다(인덱싱을 못함)

		System.out.print(Arrays.toString(array2));
		// 연산 불가
	}
}