package E1_�迭1_������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭1_������Ʈ_OMRī��_����3 {
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
		System.out.println("���� : " + count*10 + "��");
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(result));
		
	}

}
