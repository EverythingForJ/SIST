/*
�ۼ��� : ����ȯ
�ۼ����� : 5�� ���� �� ��ҹ��� ���
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class AlphabetDemo {
	public static void main(String[] args) {
		
		int upper = 65; // �빮��
		int lower = 97; // �ҹ���
		int total = 1; // ���ĺ��� 26��
	
		while( total<27 ) {
			for(int i=0; i<5; i++){
				System.out.print((char)upper + " ");
				upper++;
				lower++;
				total++;
			} // �빮�� 5�� ���
			System.out.println();

			for(int j=0; ( (j<5) && (total<27) ); j++){
				System.out.print((char)lower + " ");
				upper++;
				lower++;
				total++;
			} // �ҹ��� 5�� ���
			System.out.println();
		}
	}
}