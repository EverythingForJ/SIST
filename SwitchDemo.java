/*
�ۼ��� : ����ȯ
�ۼ����� : switch
�ۼ����� : 23/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, EditPlus 5.3
*/

public class SwitchDemo {
	public static void main(String[] args) {
/*		int number =237;
		switch(number%2){
			case 0:System.out.println("¦��"); break;
			case 1:System.out.println("Ȧ��"); break;
			// default 
		}
	
		String season = "fall";	
		switch(season){
			case "spring":System.out.println("������");break;
			default : System.out.println("����");break; // ����Ʈ ��ġ ����, ��� break���� �ʱ�.
			case "summer":System.out.println("���");break;
			case "fall":System.out.println("�ڽ���");break;
			
		}
*/		
		double avg =78.5; // �Ǽ��� �����ؼ� ����.
		switch((int)(avg/10)){ // 10 or 9
			case 10:
			case 9: System.out.println("A"); break;
			case 8: System.out.println("B"); break;
			case 7: System.out.println("C"); break;
			case 6: System.out.println("D"); break;
			default: System.out.println("F"); break;
		}
	}
}