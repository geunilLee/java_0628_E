package E1_배열1_프로젝트;

import java.util.Arrays;

public class 배열1_프로젝트_사탕나눠주기2_문제3 {
		/*
	  	[사탕나눠주기2]
	  
	   	아래 배열은 각병에 들어있는 사탕의 양이다. 
		사탕의 종류는 전부 다르고 한사람당 한병에서 25개씩 나눠줄려고 하고있다. 
		남은사탕은 옆으로 옮겨서 다음 사람한테 나눠줄수있다.
		나눠줄수있는 사람수를 
		사람수 배열에 저장하시오.
		
	 */
	
	public static void main(String[] args) {
	
		int 사탕[] =  {97, 53, 36, 22};	// 각종류의 사탕수 
		int 사람수[] = {0, 0, 0, 0};
		
		int 인당 = 25;
		
		for(int i = 0; i<4; i++) {
			사람수[i] = 사탕[i]/인당;
			if(i<3) {
				사탕[i+1] += 사탕[i]%인당;
			}			
		}
		System.out.println(Arrays.toString(사람수));
	}

}
