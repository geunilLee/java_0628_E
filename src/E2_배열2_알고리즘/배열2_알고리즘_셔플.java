package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열2_알고리즘_셔플 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {10,20,30,40,50,60};
	
		//셔플 	
		// 1) 인덱스 2개를 랜덤(0~5)으로 저장하고 각 인덱스의 값을 교환
		// 2) 위 1번을 10 번 반복하며 과정  출력 
		
		//예) 1 , 2 ==> {10,30,20,40,50,60};  // 20 과 30이 교환됨.
		
		//예) 4 , 1 ==> {10,50,20,40,30,60};  // 50 과 30이 교환됨.
		
		//예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.
		
		
		
		
		int i = 1;
		while(i<=10) {
			int idx = ran.nextInt(arr.length);
			int idx2 = ran.nextInt(arr.length);
			
			System.out.println(Arrays.toString(arr));
			if(idx != idx2) {
				int temp = arr[idx];
				arr[idx] = arr[idx2];
				arr[idx2] = temp;
				System.out.println(arr[idx]);
				System.out.println(arr[idx2]);
				//System.out.println(Arrays.toString(arr));
			}
			else{
				System.out.println(arr[idx]);
				System.out.println(arr[idx2]);
				System.out.println(Arrays.toString(arr) + "  dd");
			}		
			
			i+=1;
		}
		
		
	}
}
