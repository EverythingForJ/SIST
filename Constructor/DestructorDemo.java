

public class DestructorDemo {
	public static void main(String[] args) {
		Box box = new Box();
		box = null;
		System.gc();
	}
}

class Box{
	public Box() { // constructor
		System.out.println("��� ��ü�� �����ƽ��ϴ�.");
	}
	protected void finalize() { // destructor
		System.out.println("��� ��ü�� �Ҹ�ƽ��ϴ�.");
	}
}