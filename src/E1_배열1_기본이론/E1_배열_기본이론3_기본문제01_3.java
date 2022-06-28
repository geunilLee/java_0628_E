
package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제01_3 {
	/*
	 * 
		 [문제1] 10부터 50까지 array 배열에 저장후 배열안의 모든값을 출력한다.
		 [예] 10 20 30 40 50
	
		 [문제2] array 배열안의 모든값을 출력한다.
		 [예] 150
	 */
	public static void main(String[] args) {
		int[] array = null;// 장부는 0
		array = new int[5];// 5개의 변수생성 및 기본값은 0		
		array[0] = 10; // 각각의 변수에 값을 저장 
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		int a= 0;
		for(int i = 0; i< 5; i++) {// 돌아가는횟수가 5이상이면 오류 이유는 방이
			//모잘라서  0 1 2 3 4 index i가 0부터 시작해야되는 이유
			//모잘라서  1 2 3 4 5 i 5 미만 이하가되면 안되는이유
			a += array[i];
			
		}
		System.out.println("합 : " + a);
	}
	
	
	
	
	
	
}