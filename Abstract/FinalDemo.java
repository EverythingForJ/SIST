/*1. 상수(Constant) : 지역 상수, 멤버 상수, 클래스 상수
 * 1) 반드시 초기화해야한다.
 * 2) 상수의 이름은 모두 대문자로 표현하고,중간에 구분할 경우에는 '_'를 사용한다.
 * 3) 멤버상수 초기화는 생성자와 instance initialization block이 초기화
 * 4) 클래스 상수 초기화는 static initialization block이 초기화
 * 
 * 2. final method : 재정의 금지
 * 
 * 3. final class : 상속 금지
*/
public class FinalDemo{
	public static void main(String[] args) {
		
	}
}

final class Parent{
	public final void display() {
		System.out.println("나는 부모의 메소드");
	}
	public void print() {
		System.out.println("나는 부모의 메소드");
	}
}
