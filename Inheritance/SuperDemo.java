// this�� ���
// 1. this. : ����, ���� ��������� ��� �޼ҵ带 ��������� ��Ī�ϰ��� �� ��
// 2. this 3. this()
// super�� ���
// 1. super. : �θ���, �θ���(�������)�� ����޼ҵ带 ��������� ��Ī�ϰ��� �� ��
// 2. super()

public class SuperDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		//System.out.println(jasik.name);
		jasik.display();
	}
}

class Bumo{
	String name = "������";
	public void print() {
		System.out.println("�θ��� �޼ҵ�");
	}
}

class Jasik extends Bumo{
	String name = "������";
	public void display() {
		this.print();
		super.print();
	}
	@Override
	public void print() {
		System.out.println("�ڽ��� �޼ҵ�");
		//System.out.println("name = "+this.name);
		//System.out.println("name = "+super.name);
	}
}