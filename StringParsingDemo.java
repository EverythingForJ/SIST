import java.io.File;
import java.util.Scanner;

/*
 * ���ڿ� �Ľ�
 * " 2   422-5123   ������   1084 "
 * 1. String class�� split()
 * 2. java.util.StringTokenizer class
 * 3. java.util.Scanner class
*/
public class StringParsingDemo {
	 public static void main(String[] args) throws Exception {
		// 1.
		String str = " 2	422-5123	������	1084 ";
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
		// ������ Ÿ�� ���ϴ� ������ ���� �� �ִ� ����
//		System.out.println(other.nextInt());
//		System.out.println(other.next());
//		System.out.println(other.next());
//		System.out.println(other.nextInt());
		
		//scanner �� ���� ó���� Ưȭ�Ǿ��ִ� ������ �ִ�.
		File file = new File("C:/Temp/data.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		
		
	}
}
