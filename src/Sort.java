import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Sort {

	private Vector<Telephone> vector;
	
	public Sort(Vector<Telephone> vector) {
		this.vector = vector;
	}

	public void sort() {
//		Collections.sort(vector);
//		Collections.reverse(vector); // 정렬한 것을 반대로 뒤집어준다.
		
//		Collections.sort(this.vector, new MySort());
		
		Collections.sort(this.vector, new Comparator<Telephone>() {
			@Override
			public int compare(Telephone me, Telephone you) {
				return me.compareTo(you) * -1;
			}
		});
	}
	
/*	private class MySort implements Comparator<Telephone>{ // comparable와 위치가 다르다. 기준을 바꾸고자할 때 쓴다.

		@Override
		public int compare(Telephone me, Telephone you) {
			return me.compareTo(you) * -1;
//			if(me.getFee() > you.getFee()) return 1; // 오름차순
//			else if(me.getFee() < you.getFee()) return -1;
//			else return 0;
		}
	}
*/
}