

public class LambdaDaemo1 {
	public static void main(String[] args) {
//		Say say = new Say() {
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, world");
//				System.out.println("Nice");
//			}
//		};
//		say.saySomething();
		
//		Say say = () ->{
//				System.out.println("Hello, world");
//				System.out.println("Nice");
//			};
//		say.saySomething();
		
		
		
//		Person chulsu = new Person();
//		chulsu.greeting(new Say() {
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, world.");
//				System.out.println("Nice to");
//			}
//		});
		
		Person chulsu = new Person();
		chulsu.greeting(() -> {
				System.out.println("Hello, world.");
				System.out.println("Nice to");
		});
		
	}
}


class Person{
	public void greeting(Say say) {
		say.saySomething();
	}
}


// 함수형 인터페이스입니다를 알려준다.
@FunctionalInterface
interface Say{
	void saySomething();
}