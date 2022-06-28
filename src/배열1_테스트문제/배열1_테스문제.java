        package 배열1_테스트문제;

import java.util.Arrays;
import java.util.Random;

public class 배열1_테스문제 {
		/*
		 arr 베열중에 하나라도 홀수가있으면 fasle 짝수만 있으면 true	 
		 */
	public static void main(String[] args) {
		Random ran = new Random();
		int arr1[] = new int [5];
		int n = 0;
		while(true) {
			boolean cheack = true;
			for(int i = 0; i<arr1.length; i++) {
				int r = ran.nextInt(9)+1;
				arr1[i] = r;
				if(arr1[i]%2 != 0) {
					cheack = false;
				}				
			}
			System.out.println(Arrays.toString(arr1));
			System.out.println(cheack);
			
			n+=1;
			if(n >= 100) {
				break;
			}
		}
	}

}
