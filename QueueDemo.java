import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String>queue = new LinkedList<String>();
		String [] array = { "java", "Python","Oracle","MariaDB"};
		for(String str:array) queue.offer(str);
//		System.out.println(queue.poll()+", "+queue.size());
//		System.out.println(queue.poll()+", "+queue.size());
//		System.out.println(queue.poll()+", "+queue.size());
//		
//		System.out.println(queue.peek()+", "+queue.size());
//		System.out.println(queue.peek()+", "+queue.size());
		
		Iterator<String> iters = queue.iterator();
		
		
	}
}
