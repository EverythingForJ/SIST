/*
�ۼ��� : ����ȯ
�ۼ����� : �Ҽ����ϱ�, �迭���
�ۼ����� : 28/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ArrayDemo10 {
	public static void main(String[] args) {
		int[] array = new int[200];
		int count =0;
		for(int i=2; i<array.length; i++){
			array[i]=i; // 0 0 2 3 4 ...199
		}
		for(int i=2; i<array.length; i++){
				if(array[i]!=0){
					System.out.printf("%-5d",i);
					count++;
					if(count%10==0)System.out.println();
					for(int j = i; j<array.length; j+=i){
						array[j]=0;
					}
				}
		}
		System.out.println("\n�Ҽ��� ���� : "+count);
	}
}