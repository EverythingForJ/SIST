

public class LambdaDemo5 {
	public static void main(String[] args) {

// 1. parameter X, return X		
//		MyInterface mi = new MyInterface() {
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, World");
//			}
//		};
		
//		MyInterface mi = () -> System.out.println("Hello, World");

//		mi.saySomething();
		
// 2. 	parameter X, return O
//		MyInterface mi = () -> {
//			System.out.println("Hello, World");
//			return 100;
//		};
//		
//		System.out.println(mi.saySomething());

// 3.	parameter O, return O
//		MyInterface mi = name -> {
//			System.out.println("Your name is " + name);
//			return 100;
//		};
//		int result = mi.saySomething("sujan");
//		System.out.println(result);

// 4. 매개변수가 2개 이상일때, return O
		MyInterface mi = (a,b) -> a+b;
		int result = mi.add(5,9);
		System.out.println(result);
		
		
		
	}
}

@FunctionalInterface
interface MyInterface{
	//int saySomething(String name);
	int add(int a, int b);
}