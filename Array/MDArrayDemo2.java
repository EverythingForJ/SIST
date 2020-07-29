import java.util.Arrays;

/*
작성자 : 김준환
작성목적 : 다차원 배열 행과 열의 길이
작성일지 : 29/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class MDArrayDemo2 {

	public static void main(String[] args) {
//		int[][] array = {	 {3,4,5},
//								{6,7,8,9}
//							};
////		System.out.println(array.length); // 2차원배열에서 length는 행의 길이.
////		System.out.println(array[0].length); // 열의 길이
////		System.out.println(array[1].length); //열의 길이
//		
//		for(int i =0; i<array.length; i++) {
//			for(int j=0; j<array[i].length;j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int[][][] array = new int[3][4][5];
//		System.out.println(array.length);
//		System.out.println(array[0].length);
//		System.out.println(array[0][0].length); // 더 큰 차원의 배열의 길이 뽑기

		int[][] array = new int[3][];
		array[0] = new int[] {3,4,5,6,7};
		array[1] = new int[] {8,9};
		array[2] = new int[] {10,11,12,13};
		
		for(int[] array1 : array) { // int[] array1 = array[0], array1 = array[1]
//			for(int su : array1) {
//				System.out.print(su+"\t\t");
//			}
//			System.out.println();
			System.out.println(Arrays.toString(array1));
		}
		
	}
}