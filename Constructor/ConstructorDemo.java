

public class ConstructorDemo {
	String name;
	int price;
	boolean flag;
	// �⺻�����ڴ� public�̿����ϸ�, Ŭ���� �̸��� ����, �Ű������� ������Ѵ�.
	// �������� �ʱ�ȭ �����ش�.
	public ConstructorDemo() { // default constructor's overriding
		//this.name = null;
		this.name = "������";  // overriding
		this.price = 0;
		this.flag = false;
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo(); // new�� �ڵ����� �⺻�����ڸ� ȣ���Ѵ�.
		System.out.println("name = "+ cd.name);
		System.out.println("price = "+ cd.price);
		System.out.println("flag = "+ cd.flag);
		// �ʱⰪ�� �־��ذ� �⺻�����ڴ�.
		String str = new String(); // api���� �⺻�����ڸ� �������ش�.
//		Integer in = new Integer(); // integer�� �⺻�����ڸ� �������� �ʾƼ� ������ �߻��Ѵ�.
		
	}
}
