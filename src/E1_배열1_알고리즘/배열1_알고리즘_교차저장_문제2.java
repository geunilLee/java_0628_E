package E1_배열1_알고리즘;

import java.util.Arrays;

public class 배열1_알고리즘_교차저장_문제2 {

	/*
	 * [문제1] a의 값과 b의 값을 번갈아가면서 c에 저장한다.
	 * [예] 
	 * 	c = {10,40,20,50,30,60}
	 * 
	 * 
	 * [문제2] d의 값을 번갈아가면서 e, f 에 각각 저장 
	 * [예]
	 * 	e = {10,30,50}
	 * 	f = {20,40,60};
	 * 
	 */
	public static void main(String[] args) {
	
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
			
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		
		int index = 0;
		int p = 0;
		int z = 1;
		for(int i = 0; i < a.length;i++) {
			c[index] = a[i];	
			index += 1;
			c[index] = b[i];
			index += 1;			
		}
		System.out.println(Arrays.toString(c));
		System.out.println("--------------------------------------------");
		int index2 = 0;
		for(int i = 0; i<a.length; i++) {
			e[i] = d[index2];
			index2 +=1;
			f[i] = d[index2];
			index2 +=1;			
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}

}
