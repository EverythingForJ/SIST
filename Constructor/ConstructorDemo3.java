

public class ConstructorDemo3 {
	public static void main(String[] args) {
		Employee chulsu = new Employee("��ö��");
		chulsu.print();
		Employee younghee = new Employee("�̿���");
		younghee.print();
		Employee jimin = new Employee("������");
		jimin.print();
		// count�� static(����)�����ʴ� �̻� ������ ���� �þ�� �ʴ´�.
	}
}

//class ����� ������ ������� �Ǵ� Ŭ�������� ��������� ������ ������
//��� ������ ������� ���� ����
//Ŭ���� ������ ������� �����ϱ����� ���� �����̱� ������ �� 1���� ����
//������� �ʱ�ȭ�� �ʱ�ȭ��� �Ǵ� �����ڰ� �Ѵ�.
//Ŭ���� ������ static ����ȭ ����� �����Ѵ�.

class Employee {
	private String name;
	private int salary;
	//private int count;
	private static int count;
	static{ // class Initialization block
		count = 10;
	}
	{
		// instance initialization block
		this.salary =1000;
	}
	
	public Employee(String name) {
		this.name = name;
		this.salary = salary;
		count++;
		// static������ this�� �������� �ʴ´�.
	}
	public void print() {
		System.out.println("������ �� = "+count);
	}
}