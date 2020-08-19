import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class Sorting {
	private Vector<Patient> vector;

	Sorting(Vector<Patient> vector){
		this.vector = vector;
	}
	
	void sort() {
		Collections.sort(this.vector, new Comparator<Patient>() {
			@Override
			public int compare(Patient me, Patient you) {
				return (me.getNo()<you.getNo()) ? -1 :
								(me.getNo()>you.getNo()) ? 1 : 0;
			}
		});
	}
}