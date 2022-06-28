package E2_배열2_알고리즘;

import java.util.Arrays;

public class 배열2_알고리즘_값교체 {
	
	// 문제 1) 인덱스 2개를 입력받아 값 교체하기
			// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
			// {10, 40, 30, 20, 50}

			// 문제 2) 값 2개를 입력받아 값 교체하기
			// 예 2) 값1 입력 : 40 , 값2 입력 : 20
			// {10, 20, 30, 40, 50}

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };		
		int i1 = 1;
		int i2 = 3;
		int temp = array[i1];// 우선 인덱스 1의 값을 탬프에 저장 이후
		array[i1] = array[i2];// 인덱스 1의 값을 인덱스 3의 값인 40으로 변경 이후
		array[i2] = temp;// 이때 탬프는 20임으로 인덱스 3(40)을 20으로 변경 
		System.out.println(Arrays.toString(array));// 변경된 배열 출력(편하게 array 출력)
		
		int a = 40;
		int b = 20;
		for(int i = 0; i < array.length; i++) {
			if(a == array[i]) {
				i1 = i;// 이때 a 값은 40 반복문으로 40을 찾는다 이때 i를 i1에 저장
			}
			if(b == array[i]) {
				i2 = i;// 이때 b값은 20 반복문으로 20을 찾는다 이때 i를 i2에 저장
			}
		}
		temp = array[i1];//이때 array[i1] == 40 탬프에 40저장 이후
		array[i1] = array[i2];//array[i2](20)을 array[i1](40)으로변경 ==> array[i1] == 40
		array[i2] = temp;//array[i1] == 40이 저장되어있는 탬프를 array[i2]에 변경 ==> array[i2] == 20
		System.out.println(Arrays.toString(array));
		
		
	}

}
