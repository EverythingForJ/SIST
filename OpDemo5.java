/*
�ۼ��� : ����ȯ
�ۼ����� : ����� ������
�ۼ����� : 22/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class OpDemo5 {
	public static void main(String[] args) {
		// ���� ������ ���� ������ ��: +,-,~ �� ����� ������ int��.
		//byte a = 5;
		//byte result = ~a;
		//byte result = -a;
		// int result = ~a;
		//System.out.println("result = "+result);

		// ���׿����� ���� ������ �� : ���׿���(����� �̵�, ����, ��Ʈ, ��)�� ����� ������ int�̻��̴�.
		// byte+byte-->int, byte+short-->int, short*short-->int
/*		byte a = 5;
		byte b= 9;
		byte sum = a<<b; // +������ ����� int���� �Ǽ� �����߻�
*/
		int a=5, b=9, x=100;
		if( a>x && ++b>20){ // &&�̹� ���ǹ� ������ �����̱⿡ ++b�� ���ϰ� �ǳʶڴ�. &�� �Ѵ�.
			System.out.println("��");
		}else{
			System.out.println("����");
		}
		System.out.println("b= "+b);
	}
}