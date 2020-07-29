/*
작성자 : 김준환
작성목적 : 다차원 배열 생성
작성일지 : 29/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class MDArrayDemo1 {

	public static void main(String[] args) {
		/*
		 * 1. Rectangular Array(각 층의 열은 같다.)
		 * 2. Ragged Array(각 층의 열의 길이가 다르다.)
		 */
		//1. 선언
//		int[][] array;
//		//int [] array[];
//		//2. 생성
//		array = new int[3][4];
//		//3. 할당
//		array[0][0] = 3;
//		array[0][1] = 3;
//		array[0][2] = 3;
		
//		int[][] array;
//		array = new int[][] { {3,4,5,6,},
//									{7,8,9,10},
//									{10,11,12,13}
//									}; // 생성, 할당
		
//		int[][] array = {	 {3,4,5,6,},
//								{7,8,9,10},
//								{11,12,13,14}
//							}; // 초기화
//		
//		System.out.println(array[0][0]);

//		int[][] array;//선언
//		array = new int[3][]; // 행을 생성
//		array[0] = new int[3]; //00,01,02
//		array[1] = new int[5]; //10,11,12,13,14
//		array[2] = new int[2]; // 20,21	열을 생성
//		array[0][0] =3; // 할당
		
//		int[][] array; // 선언
//		array = new int[][] { 
//									{3, 4, 5},
//									{6, 7, 8, 9, 10},
//									{11, 12}
//									}; // 생성 및 할당
		
		int[][] array = {
								{3,4,5,},
								{6,7,8,9,10},
								{11,12}
							};
	}
}
