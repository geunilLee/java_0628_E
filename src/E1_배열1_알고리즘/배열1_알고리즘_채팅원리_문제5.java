package E1_�迭1_�˰���;

import java.util.Arrays;

public class �迭1_�˰���_ä�ÿ���_����5 {
	/*
	 * [����1] 
	 * 		array1 �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� a��  ���� �����Ѵ�.
	 * 		[��] array1 = {20,30,40,50,90};
	 * 
	 * [����2] array2 �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� b�� ���� �����Ѵ�.
	 * 		[��] array2 = {60,10,20,30,40};
	 */
	
	public static void main(String[] args) {
				
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		
		int array2[] = { 10,20,30,40,50 };
		int b = 60;
		
		for(int i = 0; i<4; i++) {
			array1[i] = array1[i+1];
		}
		array1[4] = a;
		System.out.println(Arrays.toString(array1));
		System.out.println("-------------------------------------------");
		
		for(int i = 4; i>0; i--) {
			array2[i] = array2[i-1];
		}
		array2[0] = b;
		System.out.println(Arrays.toString(array2));
	
	
	}

}
