package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_값교체4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		
		System.out.println("인덱스 입력");
		int idx = scan.nextInt();
		System.out.println("인덱스2 입력");
		int idx2 = scan.nextInt();
		
		int temp = arr[idx];
		arr[idx] = arr[idx2];
		arr[idx2] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("값 입력");
		int sel = scan.nextInt();
		System.out.println("값2 입력");
		int sel2 = scan.nextInt();
		int room = -1;
		int room2 = -2;
		for(int i = 0; i < arr.length; i ++) {
			if(sel == arr[i]) {
				room = i;
			}
			if(sel2 == arr[i]) {
				room2 = i;
			}
		}
		temp = arr[room];
		arr[room] = arr[room2];
		arr[room2] = temp;				
		System.out.println(Arrays.toString(arr));
		
	}

}
