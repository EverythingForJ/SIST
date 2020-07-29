/*
�ۼ��� : ����ȯ
�ۼ����� : ����ä��
�ۼ����� : 29/07/2020
�ۼ�ȯ�� : Windows 10, OpenJDK-14.0.2, JavaSE-14
*/

public class CheckingScore {

	public static void main(String[] args) {

		int[] per = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
		
		int[][] stu = {{1, 2, 2, 4, 2, 2, 3, 4, 1, 2},
							{1, 2, 3, 4, 1, 1, 1, 4, 1, 1},
							{1, 2, 3, 4, 1, 2, 3, 4, 1, 2},
							{1, 3, 3, 3, 3, 3, 3, 3, 1, 2},
							{1, 2, 3, 4, 1, 2, 3, 1, 1, 2}};
		
		boolean[][] result = new boolean[5][10];
		
		System.out.println("[ �л��� ���� ��� ]");
		
		for(int i=0; i<stu.length; i++) {	
			System.out.print("�л�"+(i+1)+":\t");
			for(int j=0; j<stu[i].length; j++) {
				System.out.print(stu[i][j]+"\t");
			}
			System.out.println();
		}	
		
		
		for(int i=0; i<result.length; i++) {	
			for(int j=0; j<result[i].length; j++) {
				if(per[j] == stu[i][j]) result[i][j] = true;
				else result[i][j] = false;
			}
		}
		
		System.out.println("[ ä�� ��� ]");
		for(int i=0; i<result.length; i++) {	
			int count=0;
			System.out.print("�л�"+(i+1)+":\t");
			for(int j=0; j<result[i].length; j++) {
				if(result[i][j]==true) {
					System.out.print("O\t");
					count +=10;
				}
				else System.out.print("X\t");
			}
			System.out.print("("+count+"��)");
			System.out.println();
		}	
	}

}
