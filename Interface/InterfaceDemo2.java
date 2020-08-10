


public class InterfaceDemo2 implements Father, Mother {

	@Override
	public void Mother() {
		System.out.println("Called By Mother");
	}

	@Override
	public void father() {
		System.out.println("Called By Father");
	}

	@Override
	public void grandFather() {
		System.out.println("Called By GrandFather");
	}

	@Override
	public void grandMother() {
		System.out.println("Called By GrandMother");
	}
	
	public static void main(String[] args) {
		InterfaceDemo2 id = new InterfaceDemo2();
		id.grandFather();
		id.grandMother();
		
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather(); // 8. �Ҿƹ��� �ּҷ� �Ҿƹ��� �޼ҵ常 ���� ����
		//gf.grandMother();
		
		GrandMother gm = id;
		gm.grandMother();
		
		Father fa = new InterfaceDemo2();
		fa.grandFather();
		fa.grandMother(); // 8. interface�� �ּҴ� ������ �߻�޼ҵ带 �������� �޼ҵ常 ���� ����
		fa.father();	// 9. ��ӹ��� interface�� �ּҴ� ����� interface�� �޼ҵ嵵 ���� ����
		
		System.out.println(Father.PI);
		System.out.println(Mother.PI);
		
		Mother[] array = new Mother[2]; // 10. interface�迭���� �� interface �ڽ� Ŭ������ �����.
		array[0] = id;
		array[1] = new InterfaceDemo2();
		for(Mother m : array) {
			m.Mother();
		}
		
	}
	
}