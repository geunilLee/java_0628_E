package E1_배열1_프로젝트;

import java.util.Arrays;
import java.util.Random;

public class 배열1_프로젝트_1과7만저장_문제3 {	
	/*
	 * [문제] a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
	 * [예] 1,7,7,1,1,7,7
	 */
	public static void main(String[] args) {
		Random ran = new Random();		

		int a [] = new int[7];
		
		for(int i = 0; i<7; i++) {
			int r = ran.nextInt(2);
			if(r == 1) {
				a[i] = 1;
			}
			else if(r == 0) {
				a[i] = 7;
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
