package E1_�迭1_������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭1_������Ʈ_OMRī��_����2 {
	/*
	 * [OMRī��]
	 * 
	 * 1. �迭 test�� ���蹮���� �������̴�.
	 * 2. �迭 student�� 1~5 ������ ���� ���� 5���� �����Ѵ�.	
	 * 3. ���ڸ����� ���ؼ� ������ ����Ѵ�.
	 *     ==> ������ true , Ʋ���� false
	   4. ������ �� ������ 20���̴�.
	   5. ������ ����Ѵ�.  
	   
	 * [��]
	 * test  = {1, 3, 4, 2, 5}
	 * student = {1, 1, 4, 4, 3}
	 * result  = {t, f, t, f, f} 
	*/


	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] test = {1, 3, 4, 2, 5};
		int[] student = new int[5];
		boolean[] result = new boolean[5];
		
		for(int i = 0; i<test.length; i++) {
			int r = ran.nextInt(5)+1;
			student[i] = r;
			
			if(test[i] != student[i]) {
				result[i] = false;
			}
			else if(test[i] == student[i]){
				result[i] = true;
			}
		}
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(result));
		
		
	}
}
