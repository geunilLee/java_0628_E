package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열2_알고리즘_중복숫자금지3 {

	/*
	 * [문제]
	 * 
	 *  [중복숫자 금지]
	 * 1. 0~4 사이의 숫자를 arr1배열에 저장한다.
	 * 2. 단, 중복되는 숫자는 없어야 한다.
	 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
	 * 
	 * [예]
	 * 랜덤숫자 : 1
	 * check = {false, true, false, false, false}
	 * arr1   = {1, 0, 0, 0, 0}
	 * 랜덤숫자 : 3
	 * check = {false, true, false, true, false}
	 * arr1   = {1, 3, 0, 0, 0}
	 * 랜덤숫자 : 2
	 * check = {false, true, true, true, false}
	 * arr1   = {1, 3, 2, 0, 0}
	 */

	public static void main(String[] args) {
		Random ran = new Random();

		boolean[] check = new boolean[5];
		int[] arr1 = new int[5];
		int i = 0;
		while(true) {
			int r = ran.nextInt(arr1.length);
			if(check[r] == false) {
				check [r] = true;
				arr1[i] = r;
				i+=1;
			}
			if(i == arr1.length) {
				break;
			}			
		}
		System.out.println(Arrays.toString(arr1));


	}

}
