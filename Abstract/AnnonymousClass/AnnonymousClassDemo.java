

public class AnnonymousClassDemo {
	public static void main(String[] args) {
		Product keyboard = new Product("키보드", 20000){ // 익명 클래스
			@Override
			public void print() { // 지역클래스의 메소드를 상속받지않고 바로 재정의하여 오버라이드
				System.out.println("Hello, World");
			}
		};
		keyboard.print();
		System.out.println(keyboard.getName()); // 기존기능은 그대로하며 오직 오버라이드한 메소드만 변경
	}
}

class Product{
	private String name;
	private int price;
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println("name = "+ this.name + ", price = "+ this.price);
	}
}