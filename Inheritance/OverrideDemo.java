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
	String name = "������";
	@Override
	public String toString() {
		//return "�̸��� " + this.name+"�Դϴ�.";
		return String.format("�̸��� %s�Դϴ�.", this.name);
	}
}