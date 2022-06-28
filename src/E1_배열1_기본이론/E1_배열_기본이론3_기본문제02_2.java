package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제02_2 {
	/*
	 * 	array = {10,20,30,40,50};
	 * 
		[문제1] 4의 배수만 출력한다.
		[예] 20 40
		
		[문제2] 4의 배수의 합을 출력한다.
		[예] 60
		
		[문제3] 4의 배수의 개수를 출력한다.
		[예] 2
	 */
	public static void main(String[] args) {
		
		int array []= new int[5];
		
		array [0] = 10;
		array [1] = 20;
		array [2] = 30;
		array [3] = 40;
		array [4] = 50;
		
		int a = 0;
		int i = 0;
		int count = 0;
		while(i<5) {// i가 5미만일동안 반복문 						
				if(array [i]%4 == 0) {// 배열중애 4의배수라는 조건문
					System.out.println("4의 배수 : " + array[i]);
					a += array[i];// 4의배수의 합
					count += 1;//4의 배수 갯수 카운트
				}		
			i+=1;		
		}
		System.out.println("숫자의 합 : " + a);
		System.out.println("4의배수 갯수 : " + count);
	}
}
