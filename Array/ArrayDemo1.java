/*
�ۼ��� : ����ȯ
�ۼ����� : �迭
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

/*
	�迭�� �ʱ�ȭ
	1. ���� --> byte,short,int,log -->0
	2. �Ǽ� --> float, double -->0.0
	3. �Ҹ��� --> boolean --> false
	4. ���� --> char --> �ΰ�, '\0', '\u0000' / null���� ����� �ȵȴ�.
	5. ������ --> �ּ� --> null ���� // ���� ��� String
*/

public class ArrayDemo1 {
	public static void main(String[] args) {
		String [] array = new String[4];
		for(int i = 0; i<4; i++){
			System.out.printf("array[%d]=%s\n",i,array[i]); // �ڵ� �ʱ�ȭ�ȴ�.
		}
	}
}