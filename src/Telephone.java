import java.util.Comparator;

public class Telephone implements Comparable<Telephone>{
	private int kind; 
	private String tel; 
	private String name; 
	private int quantity; 
	private int fee; 
	private int tax; 
	private int sum;
	private int gibon;
	
	public int getGibon() {
		return gibon;
	}

	public void setGibon(int gibon) {
		this.gibon = gibon;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	
	public Telephone(int kind, String tel, String name, int quantity) {
		this.kind = kind;
		this.tel = tel;
		this.name = name;
		this.quantity = quantity;
	}
	
	void print() {
		System.out.println("<< 7월 전화 요금 명세서 >>");
		System.out.println("===================================================");
		System.out.println("구분\t전화번호\t이름\t기본요금\t통화료\t세금\t합계");
		System.out.printf("%d\t%s\t%s\t%,d\t%,d\t%,d\t%,d%n",
									this.kind, this.tel, this.name, this.gibon, this.sum, this.tax, this.fee);
		System.out.println("===================================================");
	}

	@Override
	public int compareTo(Telephone other) { // 기본 정렬 기준을 설정하려고 할 때
		if(this.fee > other.fee) return 1; // 오름차순
		else if(this.fee < other.fee) return -1;
		else return 0;
	}
	
}
