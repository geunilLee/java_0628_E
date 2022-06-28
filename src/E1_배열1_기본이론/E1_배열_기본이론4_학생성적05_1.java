package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적05_1 {

	/*
	 *  
	 *  numberList = {1001, 1002, 1003, 1004, 1005};
	 *	scoreList  = {  87,   11,   45,   98,   23};
	 * 
	 *  [문제] 학번을 입력받아 성적 출력한다. 
		 		단, 없는학번 입력 시 예외처리 하시오.
		 예)
		 학번 입력 : 1002		성적 : 11점
		 학번 입력 : 1000		해당학번은 존재하지 않습니다. 
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		
		int run = 1;
		while(run == 1) {
			System.out.println("학번입력");
			int sel = scan.nextInt();
			int room = -1;
			if(sel == -1000) {
				System.out.println("종료");
				run = 0;
				break;			
			}
				
			
			for(int i = 0; i < 5; i++) {
				if(numberList[i] == sel) {
					
					room = i;
				}				
			}
			if(room == -1) {
				System.out.println("해당학번은 존재하지않습니다.");
			}
			else {
				System.out.println("학번 : " + numberList[room]);
				System.out.println("점수 : " + scoreList[room]);
			}
				
		
		
		}
		
	}

}
