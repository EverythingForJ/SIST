

public class ConstructorDemo3 {
	public static void main(String[] args) {
		Employee chulsu = new Employee("김철수");
		chulsu.print();
		Employee younghee = new Employee("이영희");
		younghee.print();
		Employee jimin = new Employee("한지민");
		jimin.print();
		// count가 static(공유)하지않는 이상 종업원 수는 늘어나지 않는다.
	}
}

//class 설계시 변수를 멤버변수 또는 클래스변수 어느것으로 결정할 것인지
//멤버 변수는 멤버마다 각각 생성
//클래스 변수는 멤버들이 접근하기위한 공유 지역이기 때문에 단 1개만 생성
//멤버변수 초기화는 초기화블록 또는 생성자가 한다.
//클래스 변수는 static 포기화 블록이 수행한다.

class Employee {
	private String name;
	private int salary;
	//private int count;
	private static int count;
	static{ // class Initialization block
		count = 10;
	}
	{
		// instance initialization block
		this.salary =1000;
	}
	
	public Employee(String name) {
		this.name = name;
		this.salary = salary;
		count++;
		// static변수는 this로 접근하지 않는다.
	}
	public void print() {
		System.out.println("종업원 수 = "+count);
	}
}