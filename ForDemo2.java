/*
�ۼ��� : ����ȯ
�ۼ����� : for(;;)����
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForDemo2 {
	public static void main(String[] args) {
/*		int i = 1; // �ۿ��� �ʱ�ȭ�ϸ� for���� ����� ������ �ִ�.
			
			for(;i<11;) { // for���� �ʱ�,���� ���� ����
				System.out.printf("%-5d",i);
				i++; // �������� for�ȿ� ���� �� �ִ�.
			}
		//System.out.printf("\n%d",i);


		for(int x= 1,y = 100; x<101; x+=3,y-=2){//�ʱⰪ,������ 2�� ���ÿ� ����(��ǥ�̿��Ͽ�)
			if(x>y) break;
		}
*/
		int x= 1,y = 100;

		for(; x<101; x+=3,y-=2){//�ʱⰪ,������ 2�� ���ÿ� ����(��ǥ�̿��Ͽ�)
			if(x>y) break;
		}
		System.out.printf("x = %d, y = %d\n",x,y);
	}
}