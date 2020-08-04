

public class Product {
	String name;
	int price;
	void copy(Product other){ // 값 복사
		other.name = this.name;
		other.price = this.price;
	}
	Product copy1(){ // 주소 복사
		System.out.println("볼펜의 주소 = "+this);
		return this; // 자기 주소를 반환한다.
	}
	
	
	
}