package E1_�迭1_������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭1_������Ʈ_1��7������_����3 {	
	/*
	 * [����] a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
	 * [��] 1,7,7,1,1,7,7
	 */
	public static void main(String[] args) {
		Random ran = new Random();		

		int a [] = new int[7];
		
		for(int i = 0; i<7; i++) {
			int r = ran.nextInt(2);
			if(r == 1) {
				a[i] = 1;
			}
			else if(r == 0) {
				a[i] = 7;
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
