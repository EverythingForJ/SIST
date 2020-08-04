

public class ConstructorDemo {
	String name;
	int price;
	boolean flag;
	// 기본생성자는 public이여야하며, 클래스 이름과 같고, 매개변수가 없어야한다.
	// 변수들을 초기화 시켜준다.
	public ConstructorDemo() { // default constructor's overriding
		//this.name = null;
		this.name = "한지민";  // overriding
		this.price = 0;
		this.flag = false;
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo(); // new는 자동으로 기본생성자를 호출한다.
		System.out.println("name = "+ cd.name);
		System.out.println("price = "+ cd.price);
		System.out.println("flag = "+ cd.flag);
		// 초기값을 넣어준게 기본생성자다.
		String str = new String(); // api에서 기본생성자를 제공해준다.
//		Integer in = new Integer(); // integer는 기본생성자를 제공하지 않아서 에러가 발생한다.
		
	}
}
