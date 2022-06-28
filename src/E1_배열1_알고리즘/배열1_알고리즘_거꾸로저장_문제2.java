package E1_배열1_알고리즘;

import java.util.Arrays;

public class 배열1_알고리즘_거꾸로저장_문제2 {
	/*
	 * a = { 1,2,3,4,5 };
	 * 
	 * [문제] a 배열의 값을 b 배열에 하나씩 저장하는데 순서를 거꾸로 저장 
	 * [예]   b = {5,4,3,2,1};
	 */
	
	public static void main(String[] args) {
		
		int a[] = { 1,2,3,4,5 };
		int b[] = { 0,0,0,0,0 };
		
		int idx = 4;
		for(int i = 0; i < a.length; i++) {
			b[idx] = a[i];
			idx-=1;
		}
		System.out.println(Arrays.toString(b));
	}
}
