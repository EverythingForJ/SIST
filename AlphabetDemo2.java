/*
�ۼ��� : ����ȯ
�ۼ����� : 5�� ���� �� ��ҹ��� ���
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class AlphabetDemo2 {
	public static void main(String[] args) {
		int count = 0, line =1;
		for(int i = 65; i<=90; i++){
			if(line%2==0){
				System.out.printf("%-5c", (char)(i+32));
			}else{
				System.out.printf("%-5c", (char)(i));	
			}
			count++;
			if(count%5==0){
				System.out.println();
				line++;
			}
		}
	}
}