package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����03_2 {
	/*
	 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
		 scoreList = { 87, 11, 45, 98, 23 };
		 [����] �й��� �Է¹޾� ���� ���
		 [����] �й� �Է� : 1003 ���� : 45��
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		
		
		int run = 1;
		while(run == 1) {
			System.out.println("�й��Է�");
			int sel = scan.nextInt();
			
			for(int i = 0; i < 5; i++) {
				
				if(numberList[i] == sel) {// 1001 == numberList[0]
				System.out.println("�й� : " +  numberList[i]+" " + "���� : " + scoreList[i]);
				}
				else if(sel == -1000) {
					System.out.println("����");
					
					run = 0;// -1000�Է½� while�� ���� 
					break;// -1000�Է½� for�� ����
				}
			}
			
		
		
		}
		


	}

}
