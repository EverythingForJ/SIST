// this()와 super()는 반드시 생성자 안에서만 위치해야한다. 반드시 첫번째줄에 위치해야한다.

public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child = new Child();
		//Child child1 = new Child(24);
		
	}
}

class Parent{
//	public Parent() {
//		System.out.println("방금 부모 클래스가 생성됐습니다.");
//	}
	public Parent(String name) {
		System.out.println("방금 부모 클래스가 생성됐습니다.");
	}
}

class Child extends Parent{
	public Child() {
		super("name");
		System.out.println("방금 자식 클래스가 생성됐습니다.");
	}
//	public Child(int age) {
//		super();
//		System.out.println("방금 자식 클래스가 생성됐습니다.");
//	}	
}