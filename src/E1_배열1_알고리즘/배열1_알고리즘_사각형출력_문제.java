package E1_배열1_알고리즘;

public class 배열1_알고리즘_사각형출력_문제 {
	/*	
	 * [문제] b 배열을 아래와같이 사각형모양으로출력한다.
	 * [힌트] 3칸마다 줄을 바꿔준다.

	   1 2 3
	   4 5 6
	   7 8 9  

	 */
	
	public static void main(String[] args) {
		
		int b [] = {1,2,3,4,5,6,7,8,9};	
		int idx = 1;
		int idx2 = 2;
		
		for(int i = 0; i<b.length; i+=3) {
			System.out.println(b[i]+ " " +b[i+idx] + " " + b[i+idx2]);
		}
	}
}
