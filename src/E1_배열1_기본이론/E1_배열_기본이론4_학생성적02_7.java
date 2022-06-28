package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적02_7 {
	/*
	 * 	 array = { 87, 11, 45, 98, 23 };
	  
		 [문제1] 인덱스를 입력받아 성적 출력
		 [정답1] 인덱스 입력 : 1 성적 : 11점
	
		 [문제2] 성적을 입력받아 인덱스 출력
		 [정답2] 성적 입력 : 11 인덱스 : 1
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = { 87, 11, 45, 98, 23 };
		
		while(true) {
			for(int i = 0; i < 5; i++) {
				System.out.println("인덱스를 입력하시오.");
				int index = scan.nextInt();
				System.out.println(array[index]);			
			}
			for(int i = 0; i < 5; i++) {
				int room = -1;// 입력값이 점수와 같지않으면 -1 출력이되는 변수
				System.out.println("성적 입력하시오.");
				int score = scan.nextInt();
				if(array[i] == score) {// 점수가 입력값이랑 같으면 i  는 룸이된다 
					room = i;
					System.out.println(room);
					
				}			
			}
			
		}
	}

}
