import java.util.Scanner;

/*
�ۼ��� : ����ȯ
�ۼ����� : 1���� �迭 ��ȭ�� �¼�
�ۼ����� : 29/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/



public class SeatingReservation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] array = new String[10]; // boolean���ε� ������
		for(int i=0; i<array.length; i++ ) array[i] = "���డ��"; // ��� �¼��� ���� �������� �ʱ�ȭ
		
		int check=0; // �������� �������� ���� ���� ���� ����
		
		do {
			System.out.print("> �¼��� �����Ͻðڽ��ϱ�?(��-1 �ƴϿ�-0) : ");
			check = scan.nextInt();
			
			if(check == 0) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break; // ���� ���� ��� ���α׷� ����
			}
			else {
				// ���� �¼� ���� �����ֱ�
				System.out.println("== ���� �¼� ���� ==");
				for(int i=0; i<array.length; i++) {
					System.out.printf("[%d]%s",i+1,array[i]);
				}
				
				
				// �¼� ���� ���湮
				System.out.println("\n�� ��° �¼��� �����Ͻðڽ��ϱ�? ");	
				int seatingNum = scan.nextInt();	// ���� ���� �¼� ��ȣ�� ��� ����
		
				if(array[seatingNum-1].equals("�����") ) {
					System.out.println("�̹� ����� �¼��Դϴ�.");
				} else if (seatingNum>array.length) {
					System.out.println("������ �Ұ����� �¼��Դϴ�."); //--------------------�����߻�
				}else {	
					array[seatingNum-1] = "�����";
					System.out.println("����Ǿ����ϴ�.");	
					System.out.println("-----------------------------------------------------------------------------");	
				}
				
				
				System.out.println("== ���� �¼� ���� ==");
				for(int i=0; i<array.length; i++) {
					System.out.printf("[%d]%s",i+1,array[i]);
					if((i+1)==5) System.out.println();
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------");
			
				
				
				// ���� ��á�� ��� ���� �Ұ�
				int count =0;
				for(int i=0;i<array.length; i++) {
					if(array[i] == "�����") count++;
				}
				if(count == array.length) {
					System.out.println("�� �̻� ������ �Ұ����մϴ�.");
					break;
				}
			}
		}while(check!=0);
	}
}
