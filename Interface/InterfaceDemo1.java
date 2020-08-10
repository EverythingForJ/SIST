/*
 * 5. interface는 추상 클래스의 일종이기 때문에 역시 new로 인스턴스화 할 수 없다. 그래서 다형성으로 구현해야 한다.
 * 6. interface의 멤버는 static 상수이기 때문에 수정할 수 없고, interface의 이름으로 접근해야한다.
*/
public class InterfaceDemo1 {
	public static void main(String[] args) {
		// Datable d = new Datable();
		Datable d = new Date();
		d.set(Datable.FRI);
		System.out.println(d.get());
	}
}