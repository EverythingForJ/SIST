// this()�� super()�� �ݵ�� ������ �ȿ����� ��ġ�ؾ��Ѵ�. �ݵ�� ù��°�ٿ� ��ġ�ؾ��Ѵ�.

public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child = new Child();
		//Child child1 = new Child(24);
		
	}
}

class Parent{
//	public Parent() {
//		System.out.println("��� �θ� Ŭ������ �����ƽ��ϴ�.");
//	}
	public Parent(String name) {
		System.out.println("��� �θ� Ŭ������ �����ƽ��ϴ�.");
	}
}

class Child extends Parent{
	public Child() {
		super("name");
		System.out.println("��� �ڽ� Ŭ������ �����ƽ��ϴ�.");
	}
//	public Child(int age) {
//		super();
//		System.out.println("��� �ڽ� Ŭ������ �����ƽ��ϴ�.");
//	}	
}