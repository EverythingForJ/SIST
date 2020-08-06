// this의 용법
// 1. this. : 나의, 나의 멤버변수와 멤버 메소드를 명시적으로 지칭하고자 할 때
// 2. this 3. this()
// super의 용법
// 1. super. : 부모의, 부모의(멤버변수)와 멤버메소드를 명시적으로 지칭하고자 할 때
// 2. super()

public class SuperDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		//System.out.println(jasik.name);
		jasik.display();
	}
}

class Bumo{
	String name = "한지민";
	public void print() {
		System.out.println("부모의 메소드");
	}
}

class Jasik extends Bumo{
	String name = "박지민";
	public void display() {
		this.print();
		super.print();
	}
	@Override
	public void print() {
		System.out.println("자식의 메소드");
		//System.out.println("name = "+this.name);
		//System.out.println("name = "+super.name);
	}
}