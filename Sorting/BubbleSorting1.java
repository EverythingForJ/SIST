/*
�ۼ��� : ����ȯ
�ۼ����� : ���� ����
�ۼ����� : 28/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSorting1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[1000];
		System.out.println("������ �Է��ϼ���.(�� 0�� ����)");
		int idx = 0;

		while(true){
			int su = scan.nextInt();
			if(su==0) break;
			array[idx++]=su;
		}
		System.out.print("Before Sorting : ");
		for(int i=0; i<idx;i++){
			System.out.printf("%-4d", array[i]);
		}
		
		for(int i=0;i<idx-1;i++){
			for(int j=0;j<idx-1-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		//System.out.print("\nAfter Sorting : "+Arrays.toString(array));
		System.out.print("\nAfter Sorting : ");
		for(int i=0;i<idx;i++){
			System.out.printf("%-4d",array[i]);
		}
	}
}