
package E2_배열2_알고리즘;
public class 배열2_알고리즘_1등 {
	/*
	 * [문제]
	 * 
	 * [1둥]
	 *   아래 데이터는 학생번호1개, 점수2개가 한세트이다. 		
		 번호는 1001부터시작이고 , 점수는 0~100 이다. 
		 예) 1001 , 20, 30 ==> 1001번 1번점수 20점, 2번점수 30점
		 		 
		
		 1등의 번호 출력한다. 
		 점수는 두점수의 합으로계산한다. 
	 */
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		
		int max = 0;
		int room = -1;
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < arr.length; i+=3){
			int c = 0;
			int idx = i+1;
			
			c += arr[idx];
			
			
			c += arr[idx+1];
		
			if(c > max) {
				max = c;
				room = i;
				a = arr[idx];
				b = arr[idx+1];
				
			}	
			System.out.println(max);
		}
		System.out.println("번호" + arr[room]+"1번 점수 "+arr[room+1]+ "2번 점수"+ b);
		
		
	}
}