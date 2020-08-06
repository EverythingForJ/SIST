import java.util.Date;

public class OverrideDemo {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		System.out.println(in.toString());
		
		Demo d= new Demo();
		System.out.println(d.toString());
		
		Date now = new Date();
		System.out.println(now.toString());
	}
}

class Demo extends Object{
	String name = "한지민";
	@Override
	public String toString() {
		//return "이름은 " + this.name+"입니다.";
		return String.format("이름은 %s입니다.", this.name);
	}
}