package E1_�迭1_������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭1_������Ʈ_1��7������_���� {	
	/*
	 * [����] a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
	 * [��] 1,7,7,1,1,7,7
	 */
	public static void main(String[] args) {
		Random ran = new Random();

		int a [] = new int[7];	
		
		for(int i = 0; i < a.length;i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				r=7;
				a[i] = r;				
			}
			else if(r == 1){
				a[i] = r;				
			}			
		}
		System.out.println(Arrays.toString(a));
		

	}
}
