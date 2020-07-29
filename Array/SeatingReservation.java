import java.util.Scanner;

/*
작성자 : 김준환
작성목적 : 1차원 배열 영화관 좌석
작성일지 : 29/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/



public class SeatingReservation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] array = new String[10]; // boolean으로도 가능함
		for(int i=0; i<array.length; i++ ) array[i] = "예약가능"; // 모든 좌석을 예약 가능으로 초기화
		
		int check=0; // 예약할지 안할지에 대한 답을 담을 변수
		
		do {
			System.out.print("> 좌석을 예약하시겠습니까?(예-1 아니오-0) : ");
			check = scan.nextInt();
			
			if(check == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break; // 예약 안할 경우 프로그램 종료
			}
			else {
				// 현재 좌석 상태 보여주기
				System.out.println("== 현재 좌석 상태 ==");
				for(int i=0; i<array.length; i++) {
					System.out.printf("[%d]%s",i+1,array[i]);
				}
				
				
				// 좌석 예약 변경문
				System.out.println("\n몇 번째 좌석을 예약하시겠습니까? ");	
				int seatingNum = scan.nextInt();	// 예약 받을 좌석 번호를 담는 변수
		
				if(array[seatingNum-1].equals("예약됨") ) {
					System.out.println("이미 예약된 좌석입니다.");
				} else if (seatingNum>array.length) {
					System.out.println("예약이 불가능한 좌석입니다."); //--------------------오류발생
				}else {	
					array[seatingNum-1] = "예약됨";
					System.out.println("예약되었습니다.");	
					System.out.println("-----------------------------------------------------------------------------");	
				}
				
				
				System.out.println("== 현재 좌석 상태 ==");
				for(int i=0; i<array.length; i++) {
					System.out.printf("[%d]%s",i+1,array[i]);
					if((i+1)==5) System.out.println();
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------");
			
				
				
				// 예약 꽉찼을 경우 예약 불가
				int count =0;
				for(int i=0;i<array.length; i++) {
					if(array[i] == "예약됨") count++;
				}
				if(count == array.length) {
					System.out.println("더 이상 예약이 불가능합니다.");
					break;
				}
			}
		}while(check!=0);
	}
}
