

public class InstanceofDemo {

	public static void main(String[] args) {
		Mammal m = new Mammal();//�θ���
		Korean ko = new Korean();//�ڽ���
		// �ѱ����� �������̴�. -> Korean is a Mammal.
		// m=ko; // �ڽ��� �θ������� ��ȯ�ϴ� ���� ������ �����Ѵ�.
		// �������� �ѱ����̴�???? X
		// ko = (Korean)m; //�ڵ�����ȯ����, ��������ȯ ������ ����
		Object obj = new Object();
		String str = new String();
		obj = str; // ���� ���� ����ȯ�� �ѹ��Ǿ����ٸ� �ؿ� ���� �������� ���డ��
		str = (String)obj;
	}

}
