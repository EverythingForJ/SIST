/*
 * static의 4가지 용법
 * 1. static 변수 : 공유의 목적
 * 2. static 메소드 : 주소 없이 사용하기 위해서, main(), Math.random()
 * 3. static 초기화 블록 : static 변수(상수) 초기화
 * 4. static class : 패키징
*/

public class StaticDemo {
	public static void main(String[] args) {
		Student[] array = new Student[3];
		for(int i = 0 ; i< array.length; i++) {
			array[i] = new Student();
		}
		for(Student s : array) System.out.println(s);
		
		Student.print(); // 주소 없이 접근
		
		
	}
}
class Student{
	public int count; // member variable
	public static int su; // static variable
	public Student() {
		count++;
		su++;
	}
	
	public static void print() {
		System.out.println("Hello");
	}
	
	@Override
	public String toString() {
		return String.format("count = %d, su = %d", this.count, su);
	}
	
}