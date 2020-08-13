import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// arrayList�� generic
// �󺧸��̶� �����ϸ� �����ϱ� ����

public class GenericDemo1 {

	public static void main(String[] args) {
//		ArrayList<String> array = new ArrayList<String>();
//		array.add("Hello");
//		array.add("World");
//		array.add("Java");
//		for(int i=0; i<array.size();i++) {
//			System.out.println(array.get(i));
//		}
//		
//		ArrayList<Integer> array1 = new ArrayList<Integer>();
//		array1.add(5);
//		int su = array1.get(0);
		
//		Object obj = new String("Hello"); // �ڵ�,���� ����ȯ ��ΰ���
//		ArrayList<Object>obj = new ArrayList<String>(); // ���׸������� �Ұ���. ���ʿ� ����ȯ�� �Ұ����ϰ��Ϸ��� ����� generic��
//		ArrayList<?>obj = new ArrayList<String>(); // ����ȯ�� �� �� �ִ� ���� Ÿ�� : ?
//		ArrayList<? extends Object >obj = new ArrayList<String>(); // ���� ���� ����
//		ArrayList<? super Object >obj = new ArrayList<String>(); // ���� ���� ����

//		List<Integer> intList = Arrays.asList(4,5,6,7,8);
//		ArrayList<Double> doubleList = (ArrayList<Double>)Arrays.asList(4.2, 5.4, 6.6);
		
		ArrayList<Integer>intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(5);
		intList.add(6);
		print(intList);
		
		ArrayList<Double>doubleList = new ArrayList<Double>();
		doubleList.add(4.1);
		doubleList.add(5.2);
		print(doubleList);
		
//		ArrayList<String>stringList = new ArrayList<String>();
//		stringList.add("sda");
//		stringList.add("adf");
//		print(stringList); // String �� numberŬ������ �ƴ�
		
	}
	
	static void print(List<? extends Number> list) {
		for(Object a :list) {
			System.out.print(a+", ");
		}
		System.out.println();
	}

}
