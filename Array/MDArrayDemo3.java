import java.util.Arrays;

/*
�ۼ��� : ����ȯ
�ۼ����� : ������ �迭 ����
�ۼ����� : 29/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class MDArrayDemo3 {
	public static void main(String[] args) {
		String[] names = {"������","������","������"};
		int [][] array = {
								{56, 78, 90, 0},
								{100,99,98, 0},
								{77, 88, 99, 0}
								};
		// ����
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length-1;j++) {
				array[i][3]+=array[i][j];
			}
		}
		// ���
		for(int i=0; i<array.length;i++) {
			System.out.print(names[i] + "\t");
			for(int j =0; j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.printf("%.2f%n",array[i][3]/3.);
		}
	}
}