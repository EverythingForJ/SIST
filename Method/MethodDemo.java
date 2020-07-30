

public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo md= new MethodDemo();
		md.PrintSum(1, 50); // Call By Name
		md.PrintSum(5, 30);
		md.PrintSum(10, 100);
		md.PrintSum(20);
		
		
	}

	void PrintSum(int start, int and) { // parameter(매개변수)
		int sum = 0;
		for(int i=start; i<=and; i++) {
			sum+=1;	
		}
		System.out.println(start+"부터"+and+"까지의 합은 ="+sum);
	}
	void PrintSum(int and) {
		int sum = 0;
		for(int i=1; i<=and; i++) {
			sum+=1;	
		}
		System.out.println("1부터"+and+"까지의 합은 ="+sum);
	}
//	
//	int PrintSum(int start, int and) {
//		int sum = 0;
//		for(int i=1; i<=and; i++) {
//			sum+=1;	
//		}
//		return sum;
//	}
}
