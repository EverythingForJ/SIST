
public class InstanceInitializationBlock {
	public static void main(String[] args) {
		Car car = new Car();
		car.print();
		// �ʱ�ȭ ���� ���� ����, �Ŀ� ������ ����
	}
	
}
class Car{
	//private String name = "�ҳ�Ÿ"; // ����� �ʱ�ȭ
	private String name;
	// �ʱ�ȭ ��
	{
		System.out.println("���� �ʱ�ȭ ���");
		this.name = "ī�Ϲ�";
	}
	//������
	public Car() {
		System.out.println("���� ������");
		this.name = "�ҳ�Ÿ";
	}
	public void print() {
		System.out.println("name = "+this.name);
	}
}