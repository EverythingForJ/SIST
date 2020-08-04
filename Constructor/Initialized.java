

public class Initialized {
	private int x; // =5;
	private String name; // = "Fred";
	
	public Initialized(int x, String name) { // 기본생성자가 아닌 일반 생성자
		this.x = x;
		this.name = name;
	}
	
	public Initialized(int x) { // 생성자의 오버로딩
		this.x = x;
	}
	
	public Initialized(String name) { // 생성자의 오버로딩
		this.name = name;
	}
	
	public static void main(String[] args) {
		Initialized in = new Initialized(5);
		System.out.println(in.x);
		System.out.println(in.name);
		
	}
}
