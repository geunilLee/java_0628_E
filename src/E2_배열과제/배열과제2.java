package E2_배열과제;

import java.util.Arrays;
import java.util.Random;

public class 배열과제2 {

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
	*/
		int c = 0;
		int arr[] = {0, 0, 0 ,0 ,0 };
		Random ran = new Random();
		for(int i = 0; i<arr.length; i ++){
			int r = ran.nextInt(10);
			 arr[i] = r;
			if(arr[i]%2 == 1) {
				c = arr[i];
				System.out.println(c);
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
