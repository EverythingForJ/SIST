import java.util.Scanner;
import java.util.Vector;

public class Main {
	private Scanner scan; // member variable
	Vector<Friend> vector;
	
	
	Main() { // 생성자
		this.scan = new Scanner(System.in);
		this.vector = new Vector<Friend>(1,1);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		do{
			int choice = m.showMenu();
			if(choice==9)break;
			m.process(choice);
		}while(true);
	}
	
	private int showMenu() {
		System.out.println("1. 추가    2. 검색    3. 목록보기    4. 삭제    9. 종료");
		System.out.print(">> ");
		return scan.nextInt();
	}
	
	private void process(int choice) {
		switch(choice) {
			case 1: gotoInput(); break;
			case 2: gotoSearch(); break;
			case 3: gotoPrint(); break;
			case 4: gotoDelete(); break;
			default : return;
		}
	}
	
	private void gotoDelete() {
		if(this.vector.size() ==0 ) {
			System.out.println("삭제할 데이터가 없습니다.");
			return;
		}else {
			Delete delete = new Delete(this.vector);
			delete.delete();
		}
	}
	
	private void gotoSearch() {
		if(this.vector.size() ==0 ) {
			System.out.println("검색할 데이터가 없습니다.");
			return;
		} else {
			Search search= new Search(this.vector);
			search.linearSearch();
		}
	}

	private void gotoPrint() {
		if(this.vector.size() ==0 ) {
			System.out.println("출력할 데이터가 없습니다.");
			return;
		}else {
			Output output = new Output(this.vector);
			output.output();
		}
	}

	private void gotoInput() {
		Input input = new Input(this.vector);
		input.input();
	}
}
