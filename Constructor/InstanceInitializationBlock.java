
public class InstanceInitializationBlock {
	public static void main(String[] args) {
		Car car = new Car();
		car.print();
		// 초기화 블럭이 먼저 실행, 후에 생성자 실행
	}
	
}
class Car{
	//private String name = "소나타"; // 명시적 초기화
	private String name;
	// 초기화 블럭
	{
		System.out.println("나는 초기화 블록");
		this.name = "카니발";
	}
	//생성자
	public Car() {
		System.out.println("나는 생성자");
		this.name = "소나타";
	}
	public void print() {
		System.out.println("name = "+this.name);
	}
}