package E2_배열2_알고리즘;

import java.util.Arrays;

public class 배열2_알고리즘_값교체2 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}

		int i1 = 1;
		int i2 = 3;
		int temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
		System.out.println(Arrays.toString(array));
		
		int a = 40;
		int b = 20;
		
		for(int i = 0; i < array.length; i++) {
			if(a == array[i]) {
				i1 = i;
			}
			if(b == array[i]) {
				i2 = i;
			}
			
		}
		temp = array[i2];// 먼제 20을 저장 
		array[i2] = array[i1];// 40위치를 in 3 => in 1
		array[i1] = temp;// 40을 20으로 변경
		System.out.println(Arrays.toString(array));
		
	}

}
