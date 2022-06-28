package E1_배열1_알고리즘;

import java.util.Scanner;

public class 배열1_알고리즘_검색_문제2 {
	
	/*
	 *  array = {1001, 20, 1002, 45, 1003, 54};
	 *  
	 *  학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
	 *  [문제] 학번을 입력하면 점수 출력한다.
	 *  [예] 1001==>20 , 1003 ==> 54
	 *  
	 *  [문제] 점수를 입력하면 학번 출력한다. 
	 *  [예] 20 ==> 1001 , 45 ==> 1002
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		System.out.println("학번입력");
		int number = scan.nextInt();
		int idx = 1;
		int room = -1;
		for(int i = 0; i< array.length; i++) {
			if(number == array[i]) {
				room = i;
			}			
		}
		System.out.println("학번 : " + array[room] +"  " + "성적 : " + array[room+idx]);
		
		System.out.println("------------------------------------------------");
		System.out.println("점수입력");
		int score = scan.nextInt();
		room = -1;
		for(int i = 0; i<array.length; i++) {
			if(array[i] == score) {
				room = i-1; 
			}
		}
		System.out.println("학번 : " + array[room]);
		
				
	}

}
