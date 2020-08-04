/*
 * 1. this. --> 나의, 명시적으로 멤버변수나 멤버메소드를 지칭할 때 사용한다.
 * 2. this  --> 나의 또 다른 주소, return this / (this)
 * 3. this() --> new 없이 생성자에서 또 다른 생성자를 호출하기, this()앞라인은 절대 아무것도 오면 안된다.
 */

public class ThisDemo1 {
	public static void main(String[] args) {
		Student chulsu = new Student(25);
		chulsu.print();
	}
}

class Student {
	private String name;
	private int age;
	
	public Student() {
		//Student s = new Student("Unknown",20);
		this("Unknown",20);
	}
	
	public Student(String name) {
		//this.name = name;
		//Student s = new Student(name, 20);
		this(name, 20);
	}
	public Student(int age) {
		//this.age = age;
		//Student s = new Student("Unknown", age);
		this("Unknown", age);
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("이름 =" + name +", 나이 = "+ age);
	}
}