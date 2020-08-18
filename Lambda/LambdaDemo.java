

public class LambdaDemo {
	public static void main(String[] args) {
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a+b;
//			}
//		};
		
		// 람다식, 위와 기능이 같다.
		// new 선언부 지우기, override지우기, method선언부 지우기, 수행하는 기능이 한줄이면 중괄호 생략 가능, return도 생략가능
		MyInterface mi = (int a, int b) -> a+b; // 인터페이스 내에 메소드가 2개이상일 경우 사용 불가.어떤 메소드인지 판단 못함.
		
		int result = mi.calculate(5, 9);
		System.out.println("resul = " + result);
	}
}

//메소드가 하나만 있어야한다는 어노테이션, 즉 람다식을 쓸 수 있다.
@FunctionalInterface 
interface MyInterface {
	int calculate(int a, int b);
//	int add(int a, int b);
}
