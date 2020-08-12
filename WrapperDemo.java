/*
 * wrapping, boxing, packaging
*/
public class WrapperDemo {
	public static void main(String[] args) {
//		int su = 5;
//		Integer in = new Integer(su); //boxing
//		int otehr = in.intValue(); // unboxing
//		
//		double avg = 89.5;
//		Double d = new Double(avg); // boxing
//		double another = d.doubleValue(); // unboxing
				
		int su =5;
		Integer in = su +100; // Integer in = new Integer(su+100); 컴파일러가 자동으로 해준 autoBoxing
		int other  = in * 500; // int other  = in.intValue() * 500; // autoUnBoxing
		
	}
}
