/*
�ۼ��� : ����ȯ
�ۼ����� : �迭
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ArrayDemo {
	public static void main(String[] args) {
/*		//1.Declaration
		int su; // �� ����
		int[] array;//�ּ� ������ �ȴ�.
		
		//2.Creation
		array = new int[4];

		//3.Assignment
		su=5;
		array[0] =3;
		array[1] =4;
		array[2] =5;
		array[3] =6;
*/
///////////////////////2��°���/////////////////////////
/*		// 1.Declaration
		int[] array;
		//2.Creation&Assingment
		array = new int[]{3,4,5,6};
*/	
//////////////////////3��° ���//////////////////////
		// 1. Declaration & Creation & Assingment
		int[] array = {3,4,5,6}; // �����Ϸ��� new�� �˾Ƽ� �־��ش�.
//		int[] array;
//		array = {3,4,5,6}; // ���� ���ο� �ѹ��� ���ϸ� ���� �߻��Ѵ�.
		array[0]=array[0]*100;
		for(int i=0;i<4;i++){
			System.out.println(array[i]);
		}
	}
}