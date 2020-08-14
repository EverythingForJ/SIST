import java.util.Scanner;
import java.util.Vector;

class Search {
	private Vector<Friend> vector;
	private Scanner scan;
	
	Search(Vector<Friend> vector) {
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}
	
	void linearSearch() {
		int i;
		System.out.print("검색할 이름 : ");
		String name = this.scan.next().trim();
		for(i =0; i<vector.size(); i++) {
			Friend f = this.vector.elementAt(i);
			if(f.getName().trim().equals(name)) {
				break;
			}
		}
		if(i==this.vector.size()) System.out.println("Not Found");
		else System.out.println(this.vector.elementAt(i));
	}
	
}
