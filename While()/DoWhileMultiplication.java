/*
�ۼ��� : ����ȯ
�ۼ����� : doWhile�� ������ �����
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class  DoWhileMultiplication {
	public static void main(String[] args) {
/*		int fir=0, sec=0;
		do{
			fir++;
			do{
				sec++;
				System.out.printf("%d x %d = %-5d	",fir,sec,fir*sec);
			}while(sec<9);
			sec=0;
			System.out.println();
		}while(fir<9);
*/
		int i = 1; // �ʱ�ȭ
		do{
			int j =2;
			do{
				System.out.printf("%d x %d = %-5d",j,i,j*i);
				j++;
			}while(j<10);
			System.out.println();
			i++;
		}while(i<10);
	}
}