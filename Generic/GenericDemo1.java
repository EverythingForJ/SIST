import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// arrayList와 generic
// 라벨링이라 생각하면 이해하기 쉬움

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
		
//		Object obj = new String("Hello"); // 자동,강제 형변환 모두가능
//		ArrayList<Object>obj = new ArrayList<String>(); // 제네릭에서는 불가능. 애초에 형변환을 불가능하게하려고 만든게 generic임
//		ArrayList<?>obj = new ArrayList<String>(); // 형변환을 할 수 있는 만능 타입 : ?
//		ArrayList<? extends Object >obj = new ArrayList<String>(); // 범위 제한 가능
//		ArrayList<? super Object >obj = new ArrayList<String>(); // 범위 제한 가능

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
//		print(stringList); // String 은 number클래스가 아님
		
	}
	
	static void print(List<? extends Number> list) {
		for(Object a :list) {
			System.out.print(a+", ");
		}
		System.out.println();
	}

}
