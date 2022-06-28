package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제03_4 {
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
		temp1 [0]= 10;
		temp1 [1]= 20; 
		temp1 [2]= 30; 
		temp1 [3]= 40;
		temp1 [4]= 50;
		
	int temp2[] = new int[5];				
	
	for(int i = 0; i < 5; i++) {
		System.out.print ("temp1 : " + temp1 [i] + "  ");
		System.out.println("temp2 : " + temp1 [i]*2);
	}
}

}
