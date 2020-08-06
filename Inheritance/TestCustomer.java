import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("주소 : ");
		String address = scan.nextLine();
		System.out.println("전화번호 : ");
		String phoneNum = scan.nextLine();
		System.out.println("고객번호 : ");
		String code = scan.nextLine();
		System.out.println("마일리지 : ");
		int point = scan.nextInt();
		
		Customer customer = new Customer(name, address, phoneNum, code, point);
		System.out.println(customer);
	}
	
}

class Person{
	private String name, address, phoneNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}

class Customer extends Person{
	private String code;
	private int point;
	
	public Customer(String name,String address,String phoneNum,String code,int point) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNum(phoneNum);
		this.code = code;
		this.point = point;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %d", getName(),getAddress(),getPhoneNum(),this.getCode(),this.getPoint());
	}
	
}