package E1_배열1_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_알고리즘_삭제원리_문제2 {
	/*
	 * 	[문제]
	 *  아래배열 a 의 안에 있는 값을 하나 입력받는다.
	 *  b배열안에 위에서 입력한 값을 제외하고 복사한다.
	 *  
	 *  [예] 30 ==> b[] = {10,20,40,50,0};
	 *  
	 *  [문제] 
	 *  아래 배열 c는 번호와 값이 한쌍인 배열이다. 
	 *  번호를 하나를 입력받고 c배열에 있는 번호이면, 
	 *  그번호와  값만 제외하고 d배열에 복사한다.
	 *  
	 *  [예] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
	 *  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
				
		
		
		System.out.println("값입력");
		int sel = scan.nextInt();
		int room = 0;
		for(int i = 0; i<a.length; i++) {
			if(sel != a[i]) {
				b[room] = a[i];
				room += 1;
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("---------------------------------------------------");
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		
		int idx = 0;
		System.out.println("삭제할 값 입력");
		int sel2 = scan.nextInt();
		
		for(int i = 0; i<c.length; i+=2) {
			if(sel2 != c[i]) {// 삭제할값을 저장하지않기위해서 입력한값이 아닌조건문으로 d배열에 저장
				d[idx] = c[i];
				idx+=1;
				d[idx] = c[i+1];
				idx+=1;				
			}			
		}
		System.out.println(Arrays.toString(d));
		
	}

}
