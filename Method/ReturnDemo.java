import java.util.Scanner;

/**
 * @author 김준환
 * @date 2020. 7. 30.
 * @objective making bmi program by using method
 * @environment : Windows10 Pro, Open JDK 14.0.2, Eclipse 2020-06
 */

public class ReturnDemo {
	public static void main(String[] args) {
		// 키와 몸무게를 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("키 입력");
		double height = scan.nextDouble();
		System.out.print("몸무게 입력");
		double weight = scan.nextDouble();
		
		// static이 아니라서 주소를 만들고, 사용할 수 있도록 한다.
		ReturnDemo rd = new ReturnDemo();
		double bmi = rd.calcBmi(height*0.01, weight); // call by value
		rd.printLevel(bmi);
	}
	
	// bmi지수 계산하는 부분, prototype
	double calcBmi(double height, double weight){
		//이미 height는 단위가 meter 단위라면
		double bmi = weight / (height* 2);
		return bmi;
	}
	// bmi지수에 의한 5단계 레벨값 출력하는 부분
	void printLevel(double bmi){
		System.out.print("BMI = ");
		if(bmi>=40)System.out.println("고도비만");
		else if(bmi>=35&&bmi<40)System.out.println("중등도 비만");
		else if(bmi>=30&&bmi<35)System.out.println("경도 비만");
		else if(bmi>=25&&bmi<30)System.out.println("과체중");
		else if(bmi>=18.5&&bmi<25)System.out.println("정상");
		else if(bmi<18.5)System.out.println("저체중");
		return;
	}

}