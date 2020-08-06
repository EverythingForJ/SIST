

public class InheritanceDemo {
	public static void main(String[] args) {
		Car car = new Car(100, 25_000_000);
		Car.name = "sonata";
		//car.speed = 100;
		//car.price = 25_000_000;
		//car.name = "sonata";
		car.run();
		
		SportsCar  sc = new SportsCar(); // 스포츠카의 변수는 하나만 생성했지만 카를 상속 받아 카의 변수를 사용할 수 있다.
//		sc.speed = 200;
//		sc.price = 250_000_000;
//		sc.name = "페라리";
//		sc.turbo = true;
//		sc.run();
		Car.name = "페라리"; // 자식이 아닌 누구나 사용할수 있기 때문에 상속이 아니다.
		
	}
}