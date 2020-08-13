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

//		System.out.println(stack.peek()+", "+stack.size()); // 현위치
//		System.out.println(stack.peek()+", "+stack.size());
//		System.out.println(stack.peek()+", "+stack.size());
//
//		System.out.println(stack.empty());
		
//		Enumeration<String> enums = stack.elements();
//		while(enums.hasMoreElements()) {
//			System.out.println(enums.nextElement()); //덩어리로 뽑아내서 스택적용x
//		}

//		Iterator<String> iters = stack.iterator();
//		while(iters.hasNext()) {
//			System.out.println(iters.next()); // 한번에 다 뽑아내서 스택 적용 x
//		}
	}
}
