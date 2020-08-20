import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo6 {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(4,6,8,5,9,5,2);
		// 원래 코드
//		Collections.sort(list);
		// 2. 
//		Collections.sort(list, new Comparator<Integer>(){
//			@Override
//			public int compare(Integer o1,Integer o2) {
//				return o1.compareTo(o2) * -1;
//			}
//		});
		// 3.
//		Collections.sort(list, (o1,o2) -> o1.compareTo(o2) * -1 );

//		System.out.println(Arrays.toString(list.toArray()));
		
		
		List<String> list = Arrays.asList("Hello", "java", "한글", "한지민", "이태리", "123");
		//Collections.sort(list);
		Collections.sort(list, (a,b)->a.compareTo(b) * -1);
		System.out.println(Arrays.toString(list.toArray()));
		
	}
}
