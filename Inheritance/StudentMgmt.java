import java.util.Scanner;

// super(), override practice

public class StudentMgmt{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] array = new Student[3];
		for(int i=0; i<array.length; i++) {
			
			System.out.println("Name : ");
			String name = scan.next();
			
			System.out.println("Age : ");
			int age = scan.nextInt();
			
			System.out.println("Major : ");
			String major = scan.next();
			
			
			array[i] = new Student(name, age, major);
		}
		
		System.out.println("===================================");
		
		for(Student s : array) {
			System.out.println(s); // toString생략
		}
		
		
	}
}

class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 = "+ getName() + ", 나이 = " + getAge();
	}
}

class Student extends Human{
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "전공 = " + this.major+", " +super.toString();
	}
	
}
