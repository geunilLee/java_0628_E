package E1_�迭1_�⺻�̷�;

import java.util.Arrays;

public class E1_�迭_�⺻�̷�3_�⺻����03_6 {
	/*
		[����1] 
		
		 array �� ���� temp1 ��  ������ ��簪�� ����Ѵ�. 
		 temp1 ==> {10, 20, 30, 40, 50}
		
		
		[����2] 
		
		 array �� ���� 2�踦 temp2�� ������ ��簪�� ����Ѵ�.
		 temp2 ==> {20, 40, 60, 80 , 100}		
	 */
	public static void main(String[] args) {

		int array[] = {10,20,30,40,50};
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		
		for(int i = 0; i<5; i++) {
			temp1[i] = array[i];
		}
		System.out.println(Arrays.toString(temp1));
		
		
		
		

	

	}

}
