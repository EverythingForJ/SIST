/*
 * 추상 클래스의 목적 : 다형성의 강제화
 * 추상 메소드의 목적 : Override의 강제화
*/
public abstract class Mammal { // 실체가 없는 클래스라 인스턴스화 할 수 없다.
	public String name;
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public abstract void print(); // 선언만. 자식이 무조건 오버라이딩해야한다.
	
}
class Lion extends Mammal {
	public Lion(String name) {
		super(name);
	}
	@Override
	public void print() {
		System.out.println("나는 자식의 메소드");
	}
}
class Tiger extends Mammal{
	public Tiger(String name) {
		super(name);
	}

	@Override
	public void print() {
				
	}
	
}