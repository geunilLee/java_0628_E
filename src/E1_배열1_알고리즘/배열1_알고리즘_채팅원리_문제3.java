package E1_�迭1_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭1_�˰���_ä�ÿ���_����3 {
	/*
	 * [����1] 
	 * 		array1 �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� a��  ���� �����Ѵ�.
	 * 		[��] array1 = {20,30,40,50,90};
	 * 
	 * [����2] array2 �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� b�� ���� �����Ѵ�.
	 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
				
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		
	
	
		int room = 0;
		for(int i = 0; i<4; i++) {		
				array1 [i]= array1[i+1];			
		}
		array1[4] = 90; 
		System.out.println(Arrays.toString(array1));
		
		System.out.println("--------------------------------------------------");
		
		int array2[] = { 10,20,30,40,50 };
		//[��] array2 = {60,10,20,30,40};
		int b = 60;
	
		for(int i = 4; i>0; i--) {
			array2[i] = array2[i-1];			
		}
		array2 [0]= 60;
		System.out.println(Arrays.toString(array2));
	
	
	}

}
