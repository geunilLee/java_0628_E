package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적02_1 {
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
		
		for(int i = 0; i < 5; i++){
			System.out.println("인뎃스 번호 : "+ i +"번 학생 : " + array[i]+"점");
		}
		
		while(true) {
			int sel = scan.nextInt();			
			for(int i = 0; i < 5; i++) {
				if(sel == i) {
					System.out.println(i + "번학생 점수 : "+ array[i]);
				}
				else if(sel == array[i]) {
					System.out.println(array[i] + "점은  " +i+ "번 학생의 점수이다");				
				}
		}
			
		}
		
		

	}

}