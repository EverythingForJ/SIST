import java.io.File;
import java.util.Scanner;

/*
 * 문자열 파싱
 * " 2   422-5123   박은지   1084 "
 * 1. String class의 split()
 * 2. java.util.StringTokenizer class
 * 3. java.util.Scanner class
*/
public class StringParsingDemo {
	 public static void main(String[] args) throws Exception {
		// 1.
		String str = " 2	422-5123	박은지	1084 ";
//		String [] array = str.trim().split("\\s");
//		System.out.println(array.length);
		
		// 2.
//		StringTokenizer st = new StringTokenizer(str.trim());
//		String [] array = new String[st.countTokens()];
//		int index =0;
//		while(st.hasMoreTokens()) {
//			array[index] = st.nextToken();
//			index++;
//		}
//		System.out.println(array[1]);
		
		// 3.
//		Scanner scan =new Scanner(str.trim());
//		Scanner other = scan.useDelimiter("\\s+");
//		String[] array = new String[100];
//		int index =0;
//		while(other.hasNext()) {
//			array[index] = other.next();
//			index++;
//		}
//		for(int i=0; i<index; i++) {
//			System.out.println(array[i]);
//		}
		// 데이터 타입 원하는 것으로 얻을 수 있는 장점
//		System.out.println(other.nextInt());
//		System.out.println(other.next());
//		System.out.println(other.next());
//		System.out.println(other.nextInt());
		
		//scanner 는 파일 처리에 특화되어있는 장점이 있다.
		File file = new File("C:/Temp/data.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		
		
	}
}
