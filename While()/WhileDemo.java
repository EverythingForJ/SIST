/*
�ۼ��� : ����ȯ
�ۼ����� : while()
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class WhileDemo {
	public static void main(String[] args) {
		// 1,2,3,4,5
/*		int i = 1; // �ʱ�ġ
		while(i<=5){ // ����
			System.out.print(i+"  ");
			i++; // ����ġ
		}
*/	
		int i = 1; //�ʱ�ġ
		while(i<101){ //����
			i++;
			if (i%7==0){
				System.out.print(i+"  ");
			}
		}
	}
}