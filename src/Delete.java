import java.util.Scanner;
import java.util.Vector;

class Delete {

	private Vector<Friend> vector;
	private Scanner scan;
	
	Delete(Vector<Friend> vector) {
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}

	public void delete() {
		int i;
		System.out.print("삭제할 사람 이름 : ");
		String name = this.scan.next().trim();
		for(i =0; i<vector.size(); i++) {
			Friend f = this.vector.elementAt(i);
			if(f.getName().trim().equals(name)) {
				break;
			}
		}
		if(i==this.vector.size()) System.out.println("Not Found");
		else {
			this.vector.removeElementAt(i);
			System.out.println("삭제 성공");
		}
	}
	
}
