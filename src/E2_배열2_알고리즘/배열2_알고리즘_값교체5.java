package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_값교체5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		System.out.println("교체할 인덱스입력");
		int sel3 = scan.nextInt();
		System.out.println("교체할 인덱스2입력");
		int sel4 = scan.nextInt();
		
		int b = 0;
		int c = 0;
		int f = 0;
		int g = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(sel3 == i) {
				c = i;
			}
			if(sel4 == i) {
				b = i;
			}			
		}
		f = arr[c];
		arr[c] = arr[b];
		arr[b] = f;
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("교체할 값입력");
		int sel = scan.nextInt();
		System.out.println("교체할 값2입력");
		int sel2 = scan.nextInt();
		
		int idx = 0;
		int room = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(sel == arr[i]) {
				room = i;				
			}
			if(sel2 == arr[i]) {
				idx = i;				
			}			
		}
		g = arr[idx];
		arr[idx] = arr[room];
		arr[room] = g;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
