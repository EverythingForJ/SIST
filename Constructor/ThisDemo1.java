/*
 * 1. this. --> ����, ��������� ��������� ����޼ҵ带 ��Ī�� �� ����Ѵ�.
 * 2. this  --> ���� �� �ٸ� �ּ�, return this / (this)
 * 3. this() --> new ���� �����ڿ��� �� �ٸ� �����ڸ� ȣ���ϱ�, this()�ն����� ���� �ƹ��͵� ���� �ȵȴ�.
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
		System.out.println("�̸� =" + name +", ���� = "+ age);
	}
}