/*
�ۼ��� : ����ȯ
�ۼ����� : �迭 ����ϴ� ���� �����
�ۼ����� : 28/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Arrays;

public class ArrayDemo8 {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		int[] array2 = new int[10];
		array2=array;

		for(int i=0; i<array.length; i++){
			System.out.printf("%5d",array2[i]);
		} // ����ϱ����� �غ�ð��� �ɸ���.
		
		for(int su:array){// ��ȭ�� for��
			System.out.printf("%5d",su);
		} // �ӵ��� ������, �ٸ� ������ �Ұ����ϴ�(�ε����� ����)

		System.out.print(Arrays.toString(array2));
		// ���� �Ұ�
	}
}