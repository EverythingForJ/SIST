/*
작성자 : 김준환
작성목적 : 버블 정렬
작성일지 : 28/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] array={5,8,2,1,4,6,2,3,7,9};
		System.out.println("BeforSorting : "+Arrays.toString(array));

		for(int i=0; i<array.length-1; i++){


			for(int j=0; j<array.length-1-i; j++){
				if(array[j]<array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}

		}
		System.out.println("AfterSorting : "+Arrays.toString(array));

	}
}