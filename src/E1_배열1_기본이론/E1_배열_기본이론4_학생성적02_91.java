package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적02_91 {

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
			
			System.out.println("인덱스 입력");
			int idx = scan.nextInt();
			System.out.println(array[idx]);
			
			System.out.println("성적 입력");
			int score = scan.nextInt();
			int room = -1;
			for(int i  = 0; i<array.length; i++) {				
				if(array[i] == score) {
					room = i;
				}				
			}
			System.out.println(room);
			
			

		}

}
