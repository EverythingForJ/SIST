// Flag Interface


public class InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo(24);
//		Demo other = d; // �ּ� ����
		// d.clone();
		
		Demo other = (Demo)d.copy();
		
		
	}
}

class Demo extends Object implements Cloneable{
	public int age;
	
	public Demo(int age) {
		this.age = age;
	}
	
	public Object copy() {
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("������ �����߽��ϴ�.");
		}
		return obj;
	}
}