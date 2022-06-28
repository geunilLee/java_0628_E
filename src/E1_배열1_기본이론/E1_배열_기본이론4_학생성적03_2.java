package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적03_2 {
	/*
	 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
		 scoreList = { 87, 11, 45, 98, 23 };
		 [문제] 학번을 입력받아 성적 출력
		 [정답] 학번 입력 : 1003 성적 : 45점
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		
		
		int run = 1;
		while(run == 1) {
			System.out.println("학번입력");
			int sel = scan.nextInt();
			
			for(int i = 0; i < 5; i++) {
				
				if(numberList[i] == sel) {// 1001 == numberList[0]
				System.out.println("학번 : " +  numberList[i]+" " + "점수 : " + scoreList[i]);
				}
				else if(sel == -1000) {
					System.out.println("종료");
					
					run = 0;// -1000입력시 while문 종료 
					break;// -1000입력시 for문 종료
				}
			}
			
		
		
		}
		


	}

}
