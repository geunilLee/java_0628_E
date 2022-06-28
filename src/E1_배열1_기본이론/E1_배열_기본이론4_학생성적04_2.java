package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적04_2 {
	/*
	 * 	numberList = {1001, 1002, 1003, 1004, 1005};
		scoreList  = {  87,   11,   45,   98,   23};
	 *  [문제] 1등학생의 학번과 성적 출력한다.
	 *  [정답] 1004번(98점)
	 */
	public static void main(String[] args) {
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		
		int room = -1;
		int a = 0;
		for(int i = 0; i < numberList.length; i++) {				
				if(a < scoreList[i]) {
					a = scoreList[i];
					room = i;
				}
			
		}
		System.out.println("1등학생 학번 : " + numberList[room] + "성적 : " + scoreList[room]);
	}

}
