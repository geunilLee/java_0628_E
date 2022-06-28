package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제01_5 {
	/*
	 * 
		 [문제1] 10부터 50까지 array 배열에 저장후 배열안의 모든값을 출력한다.
		 [예] 10 20 30 40 50
	
		 [문제2] array 배열안의 모든값을 출력한다.
		 [예] 150
	 */
	public static void main(String[] args) {
		
		int array[] = new int [5];
		array[0] = 10;// array 0번 방에 숫자 10을 입력
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int index = 0;
		int a = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("인덱스 : " +index+"번" +"  "+ array[i]);
			a += array[i];
			index+=1;
		}
		System.out.println("모든값 : " + a);
	}

}
