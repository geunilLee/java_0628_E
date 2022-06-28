package E1_배열1_알고리즘;

import java.util.Scanner;

public class 배열1_알고리즘_검색_문제 {
	
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
		
		int idx = 0;
		int idx2 = 0;
		int room = -1;
		System.out.println("학번입력");
		int sel = scan.nextInt();	
		for(int i = 0; i<array.length; i++) {
					
			if(array[i] == sel) {
				idx =i+1;
				room = i;
			}
		}
		System.out.println("학번 : "+array[room]+" "+ "점수 : " + array[idx] );
		
		System.out.println("---------------------------------------------");
		System.out.println("점수입력");
		int sel2 = scan.nextInt();
		for(int i = 0; i < array.length; i++) {
			if(array[i] == sel2) {
				idx2 = i-1;
				room = i;
			}
		}
		System.out.println("학번 : " + array[idx2]+" "+"점수 : "+array[room] );
		
		
		
		
		
		
		
		
	}
}
