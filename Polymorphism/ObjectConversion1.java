

public class ObjectConversion1 {
	public static void main(String[] args) {
//		Bumo bumo; // ����
//		
//		Jasik jasik = new Jasik("s", 24);
//		System.out.println(jasik);
		
		//�������� �θ���, �������� �ڽ���
		Bumo bumo = new Jasik("������",28);
		bumo.print();
//		bumo.display(); // �ڽ��� �����ǵ� �޼ҵ尡 �ƴ϶�� ���� �Ұ�
	}
}

class Bumo {
	private String name;

	public Bumo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bumo [name=" + name + "]";
	}
	
	public void print() {
		System.out.println("���� �θ� �޼ҵ�");
	}
}

class Jasik extends Bumo {
	private int age;

	public Jasik(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public String toString() {
		//return "Jasik [age=" + age + "]";
		return super.toString();
	}
	
	@Override
	public void print() {
		System.out.println("���� �ڽ� �޼ҵ�");
	}
	
	public void display() {
		System.out.println("���� �ڽ��� �Ϲݸ޼ҵ�");
	}
	
}
