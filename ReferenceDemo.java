/*
�ۼ��� : ����ȯ
�ۼ����� : ReferenceDemo
�ۼ����� : 21/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class ReferenceDemo {
	public static void main(String[] args) {
		Car sonata = new Car(); // ��ü�� �����ϸ� �׻� 4����Ʈ��.(�ּҸ� �������� ������). 
		// �ּҸ� �����ϴ� �������̶��Ѵ�.
		sonata.name = "�ҳ�Ÿ"; // �Ҵ�
		sonata.price = 25_000_000; // ���ڸ� ���� �˾ƺ������� ǥ���ϴ� _. �޸��� ���ڶ� ��� ����ٻ��
		sonata.maker = "����"; // �Ҵ�
		int age=24;	

		Car canival = new Car();
		canival.name = "ī�Ϲ�";
		canival.price = 35_000_000;
		canival.maker = "����ڵ���"; // ī�Ϲ��̶�� �ּҾȿ� maker��� ���� �ִ�.

		sonata.carPrint();
		canival.carPrint();
	}
}

class Car{
	String name;
	int price;
	String maker;

	public void carPrint(){
		System.out.printf("�̸� = %s, ���� = %d, ������ = %s\n",name, price, maker);
	}
}