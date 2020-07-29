/*
작성자 : 김준환
작성목적 : 점수채점
작성일지 : 29/07/2020
작성환경 : Windows 10, OpenJDK-14.0.2, JavaSE-14
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
		
		System.out.println("[ 학생들 제출 답안 ]");
		
		for(int i=0; i<stu.length; i++) {	
			System.out.print("학생"+(i+1)+":\t");
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
		
		System.out.println("[ 채점 결과 ]");
		for(int i=0; i<result.length; i++) {	
			int count=0;
			System.out.print("학생"+(i+1)+":\t");
			for(int j=0; j<result[i].length; j++) {
				if(result[i][j]==true) {
					System.out.print("O\t");
					count +=10;
				}
				else System.out.print("X\t");
			}
			System.out.print("("+count+"점)");
			System.out.println();
		}	
	}

}
