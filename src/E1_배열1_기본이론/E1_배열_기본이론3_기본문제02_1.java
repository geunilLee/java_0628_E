package E1_�迭1_�⺻�̷�;

import java.util.Arrays;

public class E1_�迭_�⺻�̷�3_�⺻����02_1 {
	/*
	 * 	array = {10,20,30,40,50};
	 * 
		[����1] 4�� ����� ����Ѵ�.
		[��] 20 40
		
		[����2] 4�� ����� ���� ����Ѵ�.
		[��] 60
		
		[����3] 4�� ����� ������ ����Ѵ�.
		[��] 2
	 */
	public static void main(String[] args) {
		int array[] = {10,20,30,40,50};
		
		int total = 0;
		int count = 0;
		for(int i = 0; i<5; i++) {
			if(array[i]%4 == 0) {
				System.out.print (array[i] + " ");
				total += array[i];
				count += 1; 
			}
		}
		System.out.println();
		System.out.print ("�հ� : " + total);
		System.out.println();
		System.out.print ("4�� ��� ���� : " + total);
	}

}
