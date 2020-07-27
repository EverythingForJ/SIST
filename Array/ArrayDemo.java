/*
작성자 : 김준환
작성목적 : 배열
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ArrayDemo {
	public static void main(String[] args) {
/*		//1.Declaration
		int su; // 값 변수
		int[] array;//주소 변수가 된다.
		
		//2.Creation
		array = new int[4];

		//3.Assignment
		su=5;
		array[0] =3;
		array[1] =4;
		array[2] =5;
		array[3] =6;
*/
///////////////////////2번째방법/////////////////////////
/*		// 1.Declaration
		int[] array;
		//2.Creation&Assingment
		array = new int[]{3,4,5,6};
*/	
//////////////////////3번째 방법//////////////////////
		// 1. Declaration & Creation & Assingment
		int[] array = {3,4,5,6}; // 컴파일러가 new를 알아서 넣어준다.
//		int[] array;
//		array = {3,4,5,6}; // 같은 라인에 한번에 안하면 에러 발생한다.
		array[0]=array[0]*100;
		for(int i=0;i<4;i++){
			System.out.println(array[i]);
		}
	}
}