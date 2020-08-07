

public class ObjectConversion1 {
	public static void main(String[] args) {
//		Bumo bumo; // 선언
//		
//		Jasik jasik = new Jasik("s", 24);
//		System.out.println(jasik);
		
		//선언형은 부모형, 실제형은 자식형
		Bumo bumo = new Jasik("박지민",28);
		bumo.print();
//		bumo.display(); // 자식의 재정의된 메소드가 아니라면 접근 불가
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
		System.out.println("나는 부모 메소드");
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
		System.out.println("나는 자식 메소드");
	}
	
	public void display() {
		System.out.println("나는 자식의 일반메소드");
	}
	
}
