/*
작성자 : 김준환
작성목적 : Label Break
작성일지 : 22/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class LabelBreakContinueDemo{
	public static void main(String[] args) {
		// for문에 Loop1이라는 이름을 붙였다.
		outer : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5)
//						break outer;
						break;
//						continue outer;
//						continue;
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();
		} 
	}
}