/*
 * �߻� Ŭ������ ���� : �������� ����ȭ
 * �߻� �޼ҵ��� ���� : Override�� ����ȭ
*/
public abstract class Mammal { // ��ü�� ���� Ŭ������ �ν��Ͻ�ȭ �� �� ����.
	public String name;
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public abstract void print(); // ����. �ڽ��� ������ �������̵��ؾ��Ѵ�.
	
}
class Lion extends Mammal {
	public Lion(String name) {
		super(name);
	}
	@Override
	public void print() {
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
}
class Tiger extends Mammal{
	public Tiger(String name) {
		super(name);
	}

	@Override
	public void print() {
				
	}
	
}