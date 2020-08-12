public class ExceptionDemo3 {
	public static void main(String[] args) {
		a();
		
		
	}
	static void a() {
		b();
	}
	static void b() {
		try {
			c();
		}catch(Exception e) {
			System.out.println("b()에서 잡았음.");
		}	
	}
	static void c() {
		d();
	}
	static void d() {
		System.out.println(4/0);
	}
	
}
