package E1_배열1_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_알고리즘_채팅원리_문제3 {
	/*
	 * [문제1] 
	 * 		array1 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 a의  값을 저장한다.
	 * 		[예] array1 = {20,30,40,50,90};
	 * 
	 * [문제2] array2 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 b의 값을 저장한다.
	 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
				
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		
	
	
		int room = 0;
		for(int i = 0; i<4; i++) {		
				array1 [i]= array1[i+1];			
		}
		array1[4] = 90; 
		System.out.println(Arrays.toString(array1));
		
		System.out.println("--------------------------------------------------");
		
		int array2[] = { 10,20,30,40,50 };
		//[예] array2 = {60,10,20,30,40};
		int b = 60;
	
		for(int i = 4; i>0; i--) {
			array2[i] = array2[i-1];			
		}
		array2 [0]= 60;
		System.out.println(Arrays.toString(array2));
	
	
	}

}
