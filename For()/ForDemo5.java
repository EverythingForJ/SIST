/*
�ۼ��� : ����ȯ
�ۼ����� : for()
�ۼ����� : 24/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ForDemo5 {
	public static void main(String[] args) {
		String[] fruits = {"���","����","����","����","������"};
		//for (int i =0;i<5;i++){
		//	System.out.println("fruits["+i+"] ="+ fruits[i]);
		//}
		for(String myvalue : fruits){ // ( ������ : �ݺ��� ���( �迭�Ǵ� �÷���))
			System.out.println(myvalue);
		} // �ε����� ��������ʾƼ� �ӵ��� ���� for��
	}
}