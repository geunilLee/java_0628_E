package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제03_2 {
	/*
	[문제1] 
	
	 array 의 값을 temp1 에  복사후 모든값을 출력한다. 
	 temp1 ==> {10, 20, 30, 40, 50}
	
	
	[문제2] 
	
	 array 의 값의 2배를 temp2에 복사후 모든값을 출력한다.
	 temp2 ==> {20, 40, 60, 80 , 100}		
 */
public static void main(String[] args) {
	
	int [] temp1 = {10, 20, 30, 40, 50};
	int [] temp2 = {20, 40, 60, 80, 100};
	for(int i = 0; i<5; i ++) {
		System.out.println("temp1 : " + temp1[i]);
		System.out.println("temp2 : " + temp2[i]);
		System.out.println("---------------------");
	}
}
}
