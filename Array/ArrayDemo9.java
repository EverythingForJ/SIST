/*
�ۼ��� : ����ȯ
�ۼ����� : arraycopy(), �ּҺ���, ������
�ۼ����� : 28/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Arrays;

public class ArrayDemo9 {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9,10}; // 10��
		int[] target = {10,9,8,7,6}; // 5��
		//System.arraycopy(original, 0, target, 0, 3);
		//System.out.println(Arrays.toString(target));		
		//original[0] = 1000;
		//System.out.println(Arrays.toString(target)); // target�Ⱥ���
		
		target = original; // �ּҺ���,deep copy
		System.out.println(Arrays.toString(target));
		original[0] = 1000;
		System.out.println(Arrays.toString(target)); // target����
	}
}