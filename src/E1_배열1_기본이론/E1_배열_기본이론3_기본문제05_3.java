package E1_배열1_기본이론;

import java.util.Random;

public class E1_배열_기본이론3_기본문제05_3 {
	/*
	 * [문제]
	 *  array 배열에 0~100사이의 랜덤값 5개 저장후 모든값을 출력한다.
	 */
	public static void main(String[] args) {
		Random ran = new Random(); 

		int array[] = new int[5];// 저장하는 장부는 방다섯개에 하나추가 0~4의 방 
		
		for(int i = 0; i < 5; i++) {// i가 0부터 5까지 반복문 i 증강
			int r = ran.nextInt(101);//반복문이 돌동안 램덤숫자 5개출력
			array[i] = r;// r을 array[i]로 변수입력
			System.out.println(array[i]);//램덤숫자를 출력하려면 array[i]를 출력
		}
		
	}
}
