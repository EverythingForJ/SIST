import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		String [] array = { "java", "Python","Oracle","MariaDB"};
		for(String str : array) stack.push(str);
//		System.out.println(stack.pop()+", "+stack.size());
//		System.out.println(stack.pop()+", "+stack.size());
//		System.out.println(stack.pop()+", "+stack.size());
//		System.out.println(stack.pop()+", "+stack.size());

//		System.out.println(stack.peek()+", "+stack.size()); // ����ġ
//		System.out.println(stack.peek()+", "+stack.size());
//		System.out.println(stack.peek()+", "+stack.size());
//
//		System.out.println(stack.empty());
		
//		Enumeration<String> enums = stack.elements();
//		while(enums.hasMoreElements()) {
//			System.out.println(enums.nextElement()); //����� �̾Ƴ��� ��������x
//		}

//		Iterator<String> iters = stack.iterator();
//		while(iters.hasNext()) {
//			System.out.println(iters.next()); // �ѹ��� �� �̾Ƴ��� ���� ���� x
//		}
	}
}
