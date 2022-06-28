package E2_배열과제;

import java.util.Arrays;
import java.util.Random;

public class E2_배열과제 {

	public static void main(String[] args) {
		
		/*
		[문제]
			5사이즈 배열에 (0~9)사이의 값을 5개를 랜덤으로 저장한다.
			배열의 각각의 값들중 홀수만 모아서 하나의 숫자로표현할려고한다. 
			하나의 숫자로표현 후 그수의 두배를 출력
		
		(예시) 
			arr ==> { 1,4,5,4,0 } ==> 에서 홀수만 모으면 숫자15 라고생각하고, 두배인 30을출력
		[정답]
			30
	*/	Random ran = new Random();
		int arr[] = new int[5];
		int a [] = new int[5];
		int count = 0;
		
		int b = 0;
		int room = 0;
		 for(int i = 0; i<arr.length; i++) {
			 int r = ran.nextInt(10);
			 arr[i] = r;
			
			 if(arr[i]%2 == 1) {
				 System.out.print (arr[i] + " ");
				 count +=1;
				 a[room] = arr[i];
				 room+=1;				 
			 }
			 
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(a));
		 for(int i = 0; i<a.length; i++) {	
			 
		 }
	}

}
