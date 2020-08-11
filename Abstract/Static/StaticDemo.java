/*
 * static�� 4���� ���
 * 1. static ���� : ������ ����
 * 2. static �޼ҵ� : �ּ� ���� ����ϱ� ���ؼ�, main(), Math.random()
 * 3. static �ʱ�ȭ ��� : static ����(���) �ʱ�ȭ
 * 4. static class : ��Ű¡
*/

public class StaticDemo {
	public static void main(String[] args) {
		Student[] array = new Student[3];
		for(int i = 0 ; i< array.length; i++) {
			array[i] = new Student();
		}
		for(Student s : array) System.out.println(s);
		
		Student.print(); // �ּ� ���� ����
		
		
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