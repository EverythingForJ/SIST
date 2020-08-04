

public class DestructorDemo {
	public static void main(String[] args) {
		Box box = new Box();
		box = null;
		System.gc();
	}
}

class Box{
	public Box() { // constructor
		System.out.println("¹æ±Ý °´Ã¼°¡ »ý¼ºµÆ½À´Ï´Ù.");
	}
	protected void finalize() { // destructor
		System.out.println("¹æ±Ý °´Ã¼°¡ ¼Ò¸êµÆ½À´Ï´Ù.");
	}
}