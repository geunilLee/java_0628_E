package E1_배열1_프로젝트;

import java.util.Arrays;
import java.util.Random;

public class 배열1_프로젝트_OMR카드_문제3 {
	/*
	 * [OMR카드]
	 * 
	 * 1. 배열 test는 시험문제의 정답지이다.
	 * 2. 배열 student에 1~5 사이의 랜덤 숫자 5개를 저장한다.	
	 * 3. 각자리수를 비교해서 점수를 기록한다.
	 *     ==> 맞으면 true , 틀리면 false
	   4. 점수는 한 문제당 20점이다.
	   5. 성적을 출력한다.  
	   
	 * [예]
	 * test  = {1, 3, 4, 2, 5}
	 * student = {1, 1, 4, 4, 3}
	 * result  = {t, f, t, f, f} 
	*/


	public static void main(String[] args) {
		Random ran = new Random();
		int[] test = {1, 3, 4, 2, 5};
		int[] student = new int[5];
		boolean[] result = new boolean[5];
		
		int count = 0;
		for(int i = 0; i<4; i++) {
			int r = ran.nextInt(5)+1;
			student[i] = r;
			if(test[i] == student[i]) {
				result[i] = true;
				count +=1;
			}
			else if(test[i] != student[i]) {
				result[i] = false;
			}			
		}
		System.out.println("점수 : " + count*10 + "점");
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(result));
		
	}

}
