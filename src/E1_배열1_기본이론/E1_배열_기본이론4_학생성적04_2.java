package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����04_2 {
	/*
	 * 	numberList = {1001, 1002, 1003, 1004, 1005};
		scoreList  = {  87,   11,   45,   98,   23};
	 *  [����] 1���л��� �й��� ���� ����Ѵ�.
	 *  [����] 1004��(98��)
	 */
	public static void main(String[] args) {
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		
		int room = -1;
		int a = 0;
		for(int i = 0; i < numberList.length; i++) {				
				if(a < scoreList[i]) {
					a = scoreList[i];
					room = i;
				}
			
		}
		System.out.println("1���л� �й� : " + numberList[room] + "���� : " + scoreList[room]);
	}

}
