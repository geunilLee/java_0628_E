package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제03_1 {
	/*
	[문제1] 
	
	 array 의 값을 temp1 에  복사후 모든값을 출력한다. 
	 temp1 ==> {10, 20, 30, 40, 50}
	
	
	[문제2] 
	
	 array 의 값의 2배를 temp2에 복사후 모든값을 출력한다.
	 temp2 ==> {20, 40, 60, 80 , 100}		
 */
public static void main(String[] args) {

	int array[] = {10,20,30,40,50};
	int temp1[] = new int[5];
	int temp2[] = new int[5];
	temp1 [0] = 10;// 0번방의 숫자느 10으로 저장
	temp1 [1] = 20;
	temp1 [2] = 30;
	temp1 [3] = 40;
	temp1 [4] = 50;
	
	temp2 [0] = 20;
	temp2 [1] = 40;
	temp2 [2] = 60;
	temp2 [3] = 80;
	temp2 [4] = 100;
	
	for(int i = 0; i < 5; i ++) {
		System.out.print ("temp1 : " + temp1[i] + "  ");
		System.out.println("temp2 : " + temp2[i]);
	}
	int[] temp = { 10, 20, 30 };
	for(int a = 0; a < 3; a ++) {
		System.out.println(temp[a]);
	}
	


}
}
