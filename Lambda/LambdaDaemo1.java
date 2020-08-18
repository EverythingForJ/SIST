

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


// �Լ��� �������̽��Դϴٸ� �˷��ش�.
@FunctionalInterface
interface Say{
	void saySomething();
}