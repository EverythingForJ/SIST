

public class InheritanceDemo {
	public static void main(String[] args) {
		Car car = new Car(100, 25_000_000);
		Car.name = "sonata";
		//car.speed = 100;
		//car.price = 25_000_000;
		//car.name = "sonata";
		car.run();
		
		SportsCar  sc = new SportsCar(); // ������ī�� ������ �ϳ��� ���������� ī�� ��� �޾� ī�� ������ ����� �� �ִ�.
//		sc.speed = 200;
//		sc.price = 250_000_000;
//		sc.name = "���";
//		sc.turbo = true;
//		sc.run();
		Car.name = "���"; // �ڽ��� �ƴ� ������ ����Ҽ� �ֱ� ������ ����� �ƴϴ�.
		
	}
}