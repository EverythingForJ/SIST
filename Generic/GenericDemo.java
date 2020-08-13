// Generics, �Ϲ�ȭ
// Object ��� ���� ������ ����. ����ȯ�� ���� �� �ִ�.
// <>�� ���� �󺧸��� ����������.
// 

public class GenericDemo {
	public static void main(String[] args) {
		//Demo d = new Demo(10);
		
		Demo<Integer> d = new Demo<Integer>(10);
		//Demo<Double> d = new Demo<Double>(10.1);
		int su = d.getCount();
		d.setCount(100);
		
		Demo<String> d2 = new Demo<String>("Hello");
		String str = d2.getCount();
		d2.setCount("World");
		
	}
}
class Demo<T>{
	// private int count;
	private T count; // private Integer count = new Integer(10);

	public Demo(T count) {
		this.count = count;
	}

	public T getCount() { // count.intValue();
		return count;
	}

	public void setCount(T count) {
		this.count = count;
	}
	
	
}