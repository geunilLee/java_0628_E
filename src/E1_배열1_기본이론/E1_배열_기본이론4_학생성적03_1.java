package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적03_1 {
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
			int room = -1;
			int i = 0;
			while(true) {
				
				System.out.println("학번입력하시오.");
				int sel = scan.nextInt();
				
				if(sel == -1000) {
					System.out.println("종료");
					break;
				}
				else if(numberList[i] == sel) {// 학번과 입력값이 같을떄 그때 스코어 리스트의 인덱스 i 번이 점수인덱스 i번과 와 동일함으로
				//스코어와 점수를 학번과 입력값이같을때 학번을 입력하여 점수와 같이출력하면 점수도같이 출력할수있다
					
					room = i;
					System.out.println("성적 : " +  scoreList[room]);
					if(i == 4) {
						
						i = 0;
				}				
				i+=1;
			}
			


		}
	}
}
