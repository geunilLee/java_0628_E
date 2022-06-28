package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제01_2 {
	/*
	 * 
		 [문제1] 10부터 50까지 array 배열에 저장후 배열안의 모든값을 출력한다.
		 [예] 10 20 30 40 50
	
		 [문제2] array 배열안의 모든값을 출력한다.
		 [예] 150
	 */
	public static void main(String[] args) {

		int[] array = new int[5];// 숫자는 0~5 이지만 6개의 박스가 만들어져있다
		array[0] = 10;// 0번이라는 박스 안에 10이 담겨있다 
		array[1] = 20;// 1번이라는 박스 안에 20이 담겨있다
		array[2] = 30;// 2번이라는 박스 안에 30이 담겨있다
		array[3] = 40;// 3번이라는 박스 안에 40이 담겨있다
		array[4] = 50;// 4번이라는 박스 안에 50이 담겨있다
		System.out.println(array);// 박스의 정보가 담겨있는 위치가 출력이된다(암호화)
		System.out.println(array[0]);// 1번 박스에 10이 담겨있어 출력시 10이 출력된다
		System.out.println(array[1]);// 2번 박스에 20이 담겨있어 출력시 20이 출력된다
		System.out.println(array[2]);// 3번 박스에 30이 담겨있어 출력시 30이 출려된다
		System.out.println(array[3]);// 4번 박스에 40이 담겨있어 출력시 40이 출력된다
		System.out.println(array[4]);// 5번 박스에 50이 담겨있어 출력시 50이 출력된다
		
		System.out.println("----------------------------------------------");
		int total = 0;// i값을 저장하는 변수
		for(int i = 0; i < 5; i++) {// 1~5 까지 i를 반복문으로 돌린다
			System.out.println(array[i]);// 1~5번 각각의 박스의 array i 값을 출력한다
			total += array[i];// 각 i 값을 total로 저장및 증감연산을 이용하여 합계를 구한다
		}
		System.out.println("합 : "+total);
		System.out.println("-----------------------------------------------");
		for(int i = 1; i < 5; i ++) {
			System.out.println(array[i]);// 1~5번 각각의 박스의 array i 값을 출력한다
		}
	}

}