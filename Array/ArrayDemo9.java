/*
작성자 : 김준환
작성목적 : arraycopy(), 주소복사, 값복사
작성일지 : 28/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Arrays;

public class ArrayDemo9 {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9,10}; // 10개
		int[] target = {10,9,8,7,6}; // 5개
		//System.arraycopy(original, 0, target, 0, 3);
		//System.out.println(Arrays.toString(target));		
		//original[0] = 1000;
		//System.out.println(Arrays.toString(target)); // target안변함
		
		target = original; // 주소복사,deep copy
		System.out.println(Arrays.toString(target));
		original[0] = 1000;
		System.out.println(Arrays.toString(target)); // target변함
	}
}