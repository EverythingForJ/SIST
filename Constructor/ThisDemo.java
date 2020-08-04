

public class ThisDemo {

	public static void main(String[] args) {
		Product ballpen = new Product();
		ballpen.name = "모나미";
		ballpen.price = 200;
		Product pencil = new Product();
//		ballpen.copy(pencil);
//		System.out.println(pencil.name);
//		System.out.println(pencil.price);
//		ballpen.price = 500;
//		System.out.println(pencil.price);
		System.out.println("볼펜의 주소 = "+ballpen);
		pencil = ballpen.copy1();
		System.out.println(pencil.name);
		System.out.println(pencil.price);
		ballpen.price = 500;
		System.out.println(pencil.price);
	}

}
