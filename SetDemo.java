import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		String [] array = { "java", "Python","Oracle","java","Oracle","MariaDB"};
		Set<String> hashset = new HashSet<String>(); // 중복되지않고 정렬은 안해서 treeset보다 빠름
		Set<String> treeset = new TreeSet<String>(); // 중복되지않고 저장할 때마다 자동 정렬을 하는 treeset
		
		for(String str : array) {
			hashset.add(str);
			treeset.add(str);
		}
		
		System.out.println(hashset);
		System.out.println(treeset);
	}
}
